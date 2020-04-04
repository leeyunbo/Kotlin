package chap03.review

/**
 * 고차 함수
 * 1. 인자나 반환값으로 함수를 사용하여 굉장히 유연하다.
 * 이 경우는 일반 함수를 사용한 경우
 */

fun main() {
    val res1 = argSum(3, 2)
    val res2 = argMul(argSum(3, 2), 3)
}

fun argSum(a: Int, b: Int) = a + b
fun argMul(a: Int, b: Int) = a - b