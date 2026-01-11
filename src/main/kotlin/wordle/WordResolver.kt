package wordle

class WordResolver(

) {
    constructor(word: Word) : this() {

    }

    fun check(input: Word, answer: Word): List<Result> {
        if (answer == input) {
            return listOf(Result.CORRECT, Result.CORRECT, Result.CORRECT, Result.CORRECT, Result.CORRECT)
        }


        return listOf()
    }

    fun getCount(ch: Char): Int {
        return 0
    }
}
