package wordle.application

import wordle.domain.result.Results
import wordle.domain.result.WordleResults
import wordle.domain.word.Word
import wordle.domain.word.WordExtractor
import wordle.domain.word.WordGenerator
import wordle.domain.word.WordResolver
import wordle.domain.word.WordValidationException
import wordle.domain.word.WordValidator
import wordle.infrastructure.FileReader
import wordle.infrastructure.Scanner
import wordle.view.Printer
import java.time.LocalDate

class GameMachine(
    fileName: String,
    private val count: Int,
) {
    private val extractor: WordExtractor = createExtractor(fileName)
    private val validator = WordValidator(extractor)

    fun start() {
        val todayWord: Word = getTodayWord()
        Printer.introduce()
        println(todayWord.value)

        val (currentCount, wordleResults) = playAllRounds(todayWord)

        Printer.result(count, currentCount, wordleResults.display())
    }

    private fun playAllRounds(todayWord: Word): Pair<Int, WordleResults> {
        var currentCount = 0
        val wordleResults = WordleResults()

        while (currentCount < count) {
            currentCount++

            val isCorrect = playRound(todayWord, wordleResults)
            if (isCorrect) break

            Printer.viewTile(wordleResults.display())
        }

        return Pair(currentCount, wordleResults)
    }

    private fun playRound(
        todayWord: Word,
        wordleResults: WordleResults,
    ): Boolean {
        Printer.requestInput()
        val input = Word(Scanner.input())

        try {
            validator.validate(input)
        } catch (_: WordValidationException) {
            return false
        }

        val resolver = WordResolver(todayWord)
        val results: Results = Wordle(resolver).round(input)
        wordleResults.add(results)

        return results.isAnswer()
    }

    private fun getTodayWord(): Word {
        return WordGenerator(extractor).generateAnswer(LocalDate.now())
    }

    private fun createExtractor(fileName: String): WordExtractor {
        return WordExtractor(FileReader.read(fileName))
    }
}
