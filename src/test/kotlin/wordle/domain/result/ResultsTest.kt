package wordle.domain.result

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

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

    @ParameterizedTest
    @EnumSource(value = Result::class, mode = EnumSource.Mode.INCLUDE, names = ["CORRECT"])
    @DisplayName("정답이라면 true를 반환합니다.")
    fun test02(result: Result) {
        // arrange
        val results = List(3) { result }
        val input = Results(results)

        // act
        val sut: Boolean = input.isAnswer()

        // assert
        assertThat(sut).isTrue
    }

    @ParameterizedTest
    @EnumSource(value = Result::class, mode = EnumSource.Mode.EXCLUDE, names = ["CORRECT"])
    @DisplayName("정답이 아니면 false를 반환합니다.")
    fun test03(result: Result) {
        // arrange
        val results = List(3) { result }
        val input = Results(results)

        // act
        val sut: Boolean = input.isAnswer()

        // assert
        assertThat(sut).isFalse
    }
}
