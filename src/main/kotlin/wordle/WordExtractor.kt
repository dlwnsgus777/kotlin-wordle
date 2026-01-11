package wordle

class WordExtractor(
    private val value: List<String>
) {
    fun getSize(): Int {
        return value.size
    }

    companion object {
        fun create(fileName: String): WordExtractor {
            return WordExtractor(FileReader.read(fileName))
        }
    }
}