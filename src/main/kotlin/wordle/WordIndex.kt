package wordle

import java.time.LocalDate

data class WordIndex(
    val value: Long
) {
    companion object {
        fun create(date: LocalDate, arraySize: Int): WordIndex {
            val baseDate: LocalDate = LocalDate.of(2021, 6, 19)

            val result: Long = (date.toEpochDay() - baseDate.toEpochDay()) % arraySize

            return WordIndex(result)
        }
    }
}
