package wordle.domain.word

data class Word(
    val value: String,
) {
    fun check(
        index: Int,
        char: Char,
    ): Boolean {
        val charArray = value.toCharArray()
        require(charArray.size >= index) { "잘못된 인덱스 호출입니다. 인덱스 : $index" }
        return charArray[index] == char
    }
}
