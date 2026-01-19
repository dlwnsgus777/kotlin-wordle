package wordle.application

import wordle.domain.result.Results
import wordle.domain.word.Word
import wordle.domain.word.WordResolver

class Wordle(
    private val resolver: WordResolver,
) {
    fun round(word: Word): Results {
        return Results(resolver.check(word))
    }
}
