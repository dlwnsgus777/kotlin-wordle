package wordle

import java.time.LocalDate

data class WordIndex(
    val value: Long
) {
    companion object {
        val BASE_DATE: LocalDate = LocalDate.of(2021, 6, 19)

        fun create(date: LocalDate, arraySize: Int): WordIndex {
            return extract(date, arraySize)
        }

        private fun extract(date: LocalDate, arraySize: Int): WordIndex {
            return WordIndex((date.toEpochDay() - BASE_DATE.toEpochDay()) % arraySize)
        }
    }
}
