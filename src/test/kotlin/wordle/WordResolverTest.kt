package wordle

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class WordResolverTest {

    @Test
    @DisplayName("모든 단어가 맞을 때 정답을 판단합니다")
    fun test01() {
        // arrange
        val input = Word("APPLE")

        val answer = Word("APPLE")

        val expected: List<Result> =
            listOf(Result.CORRECT, Result.CORRECT, Result.CORRECT, Result.CORRECT, Result.CORRECT)

        // act
        val sut: List<Result> = WordResolver(answer).check(input, answer)

        // assert
        assertThat(sut).isEqualTo(expected)
    }

    @Test
    @DisplayName("모든 단어가 틀렸을 때는 전부 ABSENT를 반환한다")
    fun test02() {
        // arrange
        val input = Word("QWRTY")

        val answer = Word("APPLE")

        val expected: List<Result> = List(5) { Result.ABSENT }

        // act
        val sut: List<Result> = WordResolver(answer).check(input, answer)

        // assert
        assertThat(sut).isEqualTo(expected)
    }

    @Test
    @DisplayName("입력된 문자열의 문자와 해당문자가 등장하는 횟수를 가져온다.")
    fun test03() {
        // arrange
        val word = Word("APPLE")
        val resolve = WordResolver(word)

        // act
        val sut = resolve.getCount('P')

        // assert
        assertThat(sut).isEqualTo(2)
    }

    @Test
    @DisplayName("전달한 단어가 일부만 맞았을 때는 PRESENT를 포함하여 반환한다")
    fun test04() {
        // arrange
        val input = Word("AECCB")

        val answer = Word("APPLE")

        val expected: List<Result> = listOf(
            Result.CORRECT, Result.PRESENT, Result.ABSENT, Result.ABSENT, Result.ABSENT,
        )

        // act
        val sut: List<Result> = WordResolver(answer).check(input, answer)

        // assert
        assertThat(sut).isEqualTo(expected)
    }
}
