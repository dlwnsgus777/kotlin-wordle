package wordle

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.time.LocalDate

class WordGeneratorTest {

    @Test
    fun 오늘의_단어를_반환한다() {
        // arrange
        val wordGenerator = WordGenerator()
        val today: LocalDate = LocalDate.of(2021, 6, 19)
        val fileName: String = "testWord.txt"

        val expected: Word = Word("zin")

        // act
        val sut:Word = wordGenerator.generateAnswer(today, fileName);

        // assert
        assertThat(sut).isEqualTo(expected)
    }
}
