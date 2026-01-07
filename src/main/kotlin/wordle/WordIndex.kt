package wordle

import java.time.LocalDate

data class WordIndex(
    val value: Long
) {
    companion object {
        const val MIN_INDEX: Long = 0L
        val BASE_DATE: LocalDate = LocalDate.of(2021, 6, 19)

        fun create(date: LocalDate, arraySize: Int): WordIndex {
            return extract(date, arraySize)
        }

        private fun extract(date: LocalDate, arraySize: Int): WordIndex {
            val result = calculate(date, arraySize)

            if (result < MIN_INDEX) {
                return WordIndex(MIN_INDEX)
            }

            return WordIndex(result)
        }

        private fun calculate(date: LocalDate, arraySize: Int): Long {
            return (date.toEpochDay() - BASE_DATE.toEpochDay()) % arraySize
        }
    }
}
