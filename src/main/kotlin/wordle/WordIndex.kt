package wordle

import java.time.LocalDate

data class WordIndex(
    val value: Int
) {
    companion object {
        fun create(date: LocalDate, arraySize: Int): WordIndex {
            throw Exception("not supported")
        }
    }
}
