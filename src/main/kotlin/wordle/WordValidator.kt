package wordle

class WordValidator(
) {
    fun validate(word: Word) {
        require(!word.value.isBlank()
                && word.value.length == 5) { "입력값은 5글자여야 합니다." }
    }

}
