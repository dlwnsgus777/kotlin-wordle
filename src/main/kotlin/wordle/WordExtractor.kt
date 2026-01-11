package wordle

import java.io.File

class WordExtractor {
    fun read(name: String): File {
        val classLoader = javaClass.classLoader
        val result = File(classLoader.getResource(name).file)
        if (!result.exists()) {
            throw IllegalArgumentException("File does not exist: $name")
        }
        return result
    }
}
