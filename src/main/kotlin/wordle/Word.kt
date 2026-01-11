package wordle

data class Word(
    private val word: String,
    private val counter: Map<Char, Int>
) {
    constructor(word: String) : this(word, init(word))

    fun getCount(char: Char): Int {
        return counter[char] ?: 0
    }

    companion object {
        private fun init(word: String): Map<Char, Int> {
            return word.groupBy { it }
                .mapValues { (_, v) -> v.size }
        }
    }
}
