package wordle

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

/**
 * - 오늘의 단어 추출
 *  - 배열의 크기
 * - wordIndex
 *
 */
class WordExtractorTest {
    @Test
    @DisplayName("배열의 크기를 구한다.")
    fun test01() {
        // arrange
        val fileName: String = "testWord.txt"

        val extractor: WordExtractor = WordExtractor.create(fileName)

        // act
        val sut: Int = extractor.getSize()

        // assert
        assertThat(sut).isEqualTo(2)
    }


}
