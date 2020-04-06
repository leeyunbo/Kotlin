package chap03.review

/**
 * crossinline을 통하여 비지역 반환을 방지할 수 있음
 * inline 함수에서는 람다함수 내부에서도 리턴이 가능함
 * 따라서 crossinline을 활용하여 리턴을 방지함으로써 쓸데없는 오류를 방지할 수  있음
 */
fun main() {
    shortFunc(3) {
        println("First call: $it")
    }
}

private inline fun shortFunc(a: Int,crossinline out: (Int) -> Unit) {
    println("Before")
    nestedFunc{ out(a) }
    println("After")
}

private fun nestedFunc(body: () -> Unit) {
    body()
}