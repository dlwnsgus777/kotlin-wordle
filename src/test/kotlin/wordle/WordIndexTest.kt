package wordle

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.time.LocalDate

class WordIndexTest {

    @Test
    fun 오늘의_단어_순번은_전달받은_날짜_빼기_2021년_6월_19일_나누기_배열의_크기() {
        // act
        val date = LocalDate.of(2026, 1, 7)
        val baseDate = LocalDate.of(2021, 6, 19)
        val arraySize = 20
        val expectedWordIndex = (date.toEpochDay() - baseDate.toEpochDay()) % arraySize

        // arrange
        val sut = WordIndex.create(date, arraySize)

        // assert
        assertThat(sut.value).isEqualTo(expectedWordIndex)
    }
}
