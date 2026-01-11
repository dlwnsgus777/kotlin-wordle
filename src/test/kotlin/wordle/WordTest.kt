package wordle

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class WordTest {

    @Test
    @DisplayName("입력된 인덱스와 입력된 캐릭터가, Word와 동일한지 판단한다")
    fun test01() {
        // arrange
        val input: Word = Word("APPLE")

        val index: Int = 0
        val char: Char = 'A'

        // act
        val sut: Boolean = input.check(index, char)

        // assert
        assertThat(sut).isTrue
    }
}
