package wordle

class WordExtractor(
    value: List<String>
) {
    fun getSize(): Int {
        return 0
    }

    companion object {

        fun create(fileName: String): WordExtractor {
            val list: List<String> = FileReader.read(fileName)

            return WordExtractor(list)
        }
    }
}