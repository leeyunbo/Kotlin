package chap03.review

/**
 * 참조에 의한 호출 예제
 *
 */

fun main(){
    val res1 = funcParam(3, 2, ::sum)
    println(res1)

    hello(::text)

    val likeLambda = ::sum
    println(likeLambda(6, 6))
}

private fun sum(a: Int, b: Int) = a + b

private fun text(a: String, b: String): String = "$a, $b"

private fun funcParam(a: Int, b: Int, c: (Int,Int) -> Int): Int {
    return c(a,b)
}

private fun hello(body: (String, String) -> String): Unit {
    println(body("Hello", "World"))
}
