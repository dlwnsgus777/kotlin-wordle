package wordle

class WordResolver {
    fun check(input: Word, answer: Word): List<Result> {
        if (answer == input) {
            return listOf(Result.CORRECT, Result.CORRECT, Result.CORRECT, Result.CORRECT, Result.CORRECT)
        }
        return listOf()
    }
}
