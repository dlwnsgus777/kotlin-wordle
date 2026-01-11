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
        val sut: List<Result> = WordResolver(input).check(input, answer)

        // assert
        assertThat(sut).isEqualTo(expected)
    }

    @Test
    @DisplayName("모든 단어가 틀렸을 때는 전부 ")
    fun test02() {
        // arrange
        val input = Word("APPLE")

        val answer = Word("APPLE")

        val expected: List<Result> =
            listOf(Result.CORRECT, Result.CORRECT, Result.CORRECT, Result.CORRECT, Result.CORRECT)

        // act
        val sut: List<Result> = WordResolver(input).check(input, answer)

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
}
