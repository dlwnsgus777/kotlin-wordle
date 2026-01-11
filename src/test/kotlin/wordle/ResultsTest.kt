package wordle

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ResultsTest {

    @Test
    @DisplayName("정답을 이모지로 반환합니다.")
    fun test01() {
        // arrange
        val input = Results(listOf(Result.CORRECT, Result.ABSENT, Result.PRESENT))
        val expected = "🟩⬜🟨"

        // act
        val sut: String = input.convert()

        // assert
        assertThat(sut).isEqualTo(expected)
    }
}
