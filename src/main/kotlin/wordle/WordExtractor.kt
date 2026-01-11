package wordle

// TODO: WordExtractor에서 FileReader 의존 끊기
class WordExtractor(
    private val value: List<String>
) {
    fun getSize(): Int {
        return value.size
    }

    fun get(index: Int): Word {
        if (index < 0 || index >= getSize()) {
            throw IllegalArgumentException("Index out of range: $index")
        }

        return Word(value.get(index))
    }

    fun exists(word: Word): Boolean {
        return value.contains(word.value)
    }

    companion object {
        fun create(fileName: String): WordExtractor {
            return WordExtractor(FileReader.read(fileName))
        }
    }
}