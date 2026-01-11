package wordle

class WordExtractor(
    private val value: List<String>
) {
    fun getSize(): Int {
        return value.size
    }

    fun get(index: Int): Word {
        return Word(value.get(index))
    }

    companion object {
        fun create(fileName: String): WordExtractor {
            return WordExtractor(FileReader.read(fileName))
        }
    }
}