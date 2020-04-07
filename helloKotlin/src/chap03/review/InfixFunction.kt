package chap03.review
/**
 * 1. 중위 표현법
 * 클래스의 멤버를 호출할 때 사용하는 .을 생략하고 함수 이름 뒤에 소괄호를 붙이지 않아 직관적인 코드 작성 가능한 표현법
 *
 * 2. 중위 함수의 조건
 * - 멤버 메서드 또는 확장 함수
 * - 하나의 매개변수
 * - infix 키워드 사용
 */
fun main() {
    val multi = 3 multiply 10
    println(multi)
}

infix fun Int.multiply(x: Int): Int {
    return this * x
}