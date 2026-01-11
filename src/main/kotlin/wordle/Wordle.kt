package wordle

class Wordle(
    private val resolver: WordResolver
) {
    fun round(word: Word): Results {
        return Results(resolver.check(word))
    }
}
