package wordle


/**
 *  - 오늘의 단어는, `((현재 날짜 - 2021년 6월 19일) % 배열의 크기)` 번째의 단어이다.
 *      - WordIndex 객체
 *          - 생성할 때 날짜, 배열의 크기
 *          - index 값을 가지고 있는
 *  - 오늘의 단어는 `words.txt`에 존재하는 단어여야한다.
 */
class WordGenerator {
    fun generateAnswer(): Word {
        return Word("temp")
    }
}
