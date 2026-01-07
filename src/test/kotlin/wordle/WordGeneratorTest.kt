package wordle

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WordGeneratorTest {

    @Test
    fun 오늘의_단어를_반환한다() {
        // act
        val wordGenerator = WordGenerator()

        // arrange
        val sut:Word = wordGenerator.generateAnswer();

        // assert
        assertThat(sut).isNotNull
    }
}
