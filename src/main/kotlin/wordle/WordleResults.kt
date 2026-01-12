package wordle

class WordleResults(
    private val value: MutableList<Results> = mutableListOf()
) {
    fun add(results: Results) {
        value.add(results)
    }

    fun display(): String {
        val stringBuilder: StringBuilder = StringBuilder()

        value.forEach { stringBuilder.append(it.convert()).append("\n") }

        return stringBuilder.toString().trim()
    }
}
