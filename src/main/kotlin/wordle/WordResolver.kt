package wordle

class WordResolver(
    private val word: Word,
    private val counter: Map<Char, Int>
) {
    constructor(word: Word) : this(word, init(word))

    fun check(input: Word, answer: Word): List<Result> {
        if (answer == input) {
            return listOf(Result.CORRECT, Result.CORRECT, Result.CORRECT, Result.CORRECT, Result.CORRECT)
        }

        return listOf()
    }

    fun getCount(char: Char): Int {
        return counter[char] ?: 0
    }

    companion object {
        private fun init(word: Word): Map<Char, Int> {
            val wordString: String = word.value
            return wordString.groupBy { it }
                .mapValues { (_, v) -> v.size }
        }
    }
}
