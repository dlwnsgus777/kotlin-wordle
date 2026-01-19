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
            throw IllegalArgumentException("잘못된 인덱스 호출입니다. 인덱스 : $index")
        }

        return Word(value[index])
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