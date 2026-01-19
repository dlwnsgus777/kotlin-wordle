package wordle.domain.word

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.time.LocalDate

class WordGeneratorTest {
    val fileName: String = "testWord.txt"
    val wordExtractor = WordExtractor.create(fileName)

    @Test
    @DisplayName("오늘의 단어를 반환한다")
    fun test01() {
        // arrange
        val wordGenerator = WordGenerator(wordExtractor)
        val today: LocalDate = LocalDate.of(2021, 6, 19)
        val expected = Word("zin")

        // act
        val sut: Word = wordGenerator.generateAnswer(today)

        // assert
        assertThat(sut).isEqualTo(expected)
    }
}
