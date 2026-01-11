package wordle

data class Word(
    val value: String
) {
    fun check(index: Int, char: Char): Boolean {
        return value.toCharArray().get(index) == char
    }
}
