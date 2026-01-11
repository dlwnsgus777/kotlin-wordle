package wordle

class WordResolver(
    private val word: Word,
    private val counter: MutableMap<Char, Int>
) {
    constructor(word: Word) : this(word, init(word))

    fun check(input: Word, answer: Word): List<Result> {
        val result = MutableList(5) { Result.ABSENT }

        val charArray = input.value.toCharArray()
        // 인덱스와 char가 같은지 판단
        for (it in charArray.indices) {
            val checkValue = answer.check(it, charArray[it])

            // result 같으면, word count 차감 및 결과 반환
            if (checkValue) {
                result[it] = Result.CORRECT
                counter[charArray[it]] = counter.getValue(charArray[it]) - 1
            }
        }

        // 다른 인덱스에도 해당 문자열이 있는지 판단

        return result
    }

    fun getCount(char: Char): Int {
        return counter[char] ?: 0
    }

    companion object {
        private fun init(word: Word): MutableMap<Char, Int> {
            val wordString: String = word.value
            return wordString.groupBy { it }
                .mapValues { (_, v) -> v.size } as MutableMap<Char, Int>
        }
    }
}
