package wordle

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class WordTest {

    @Test
    @DisplayName("입력된 문자열의 문자와 해당문자가 등장하는 횟수를 가져온다.")
    fun test01() {
        // arrange
        val word = Word("APPLE")

        // act
        val sut = word.getCount('P')

        // assert
        assertThat(sut).isEqualTo(2)
    }
}
