package wordle

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WordGeneratorTest {

    @Test
    fun 오늘의_단어를_반환한다() {
        // arrange
        val wordGenerator = WordGenerator()

        // act
        val sut:Word = wordGenerator.generateAnswer();

        // assert
        assertThat(sut).isNotNull
    }
}
