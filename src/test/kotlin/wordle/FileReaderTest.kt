package wordle

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.io.File

class FileReaderTest {

    @Test
    @DisplayName("외부로부터 입력 받은 파일을 읽어 옵니다.")
    fun test01() {
        // arrange
        val name = "words.txt"

        // act
        val sut: File = WordExtractor().read(name)

        // assert
        assertThat(sut).isNotNull
    }

    @Test
    @DisplayName("전달받은 파일 이름이 존재하지 않으면 에러가 발생한다")
    fun test02() {
        // arrange
        val name = "testWord.txt"

        // act & assert
        assertThatThrownBy { WordExtractor().read(name) }.isInstanceOf(IllegalArgumentException::class.java)
    }
}
