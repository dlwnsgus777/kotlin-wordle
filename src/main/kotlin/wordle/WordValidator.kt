package wordle

class WordValidator(
) {
    fun validate(word: Word) {
        require(!word.value.isBlank()
                && word.value.length == 5) { "입력값은 5글자여야 합니다." }

        require(REGEX.matches(word.value)) { "입력값은 영어여야 합니다." }
    }

    companion object {
        private val REGEX = Regex("^[a-zA-Z]*$")
    }
}
