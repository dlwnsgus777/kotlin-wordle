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
        val sut: List<Result> = WordResolver().check(input, answer)

        // assert
        assertThat(sut).isEqualTo(expected)
    }
}
