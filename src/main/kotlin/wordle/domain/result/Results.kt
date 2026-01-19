package wordle.domain.result

data class Results(
    val values: List<Result>,
) {
    fun convert(): String {
        val builder = StringBuilder()
        for (result in values) {
            builder.append(
                when (result) {
                    Result.ABSENT -> "⬜"
                    Result.PRESENT -> "🟨"
                    else -> "🟩"
                },
            )
        }
        return builder.toString()
    }

    fun isAnswer(): Boolean {
        return values.all { it == Result.CORRECT }
    }
}
