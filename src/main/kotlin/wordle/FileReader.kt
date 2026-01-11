package wordle

import java.io.File

class FileReader {
    fun read(name: String): List<String> {
        throw RuntimeException("Not implemented")
    }

    private fun readFile(name: String): File {
        val classLoader = javaClass.classLoader
        val result = File(classLoader.getResource(name).file)
        if (!result.exists()) {
            throw IllegalArgumentException("File does not exist: $name")
        }
        return result
    }
}
