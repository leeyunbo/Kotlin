package chap03.section1.basic

/**
 * 람다식을 변수에 저장하는 예제
 * 자동 추론이 가능하다.
 */

fun main() {
    var result: Int
    val multi = {x: Int, y: Int -> x * y}
    result = multi(10,20)
    println(result)
}