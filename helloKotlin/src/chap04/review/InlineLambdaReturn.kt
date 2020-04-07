package chap04.review

/**
 * inline 함수가 아닌 인자로 전해진 람다에서 return을 수행하기 위해서는
 * return@라벨 이름을 붙여줘야 함
 * inline 함수에서 람다함수가 return을 사용할 경우 inline 함수도 한꺼번에 종류되는 비지역 반환이 이루어지지만
 * inline 함수가 아닌 곳에서 return@라벨 이름으로 반환을 하게 되면, 람다만 종료됨!
 *
 * 반환할 것이 있다면 익명함수를 권장!
 */
fun main() {
    retFunc()
    inlineLambda(13,3, fun(a,b) {
        val result = a + b
        if(result > 10) return
        println("result : $result")
    })
}

private fun inlineLambda(a: Int, b: Int, out: (Int,Int) -> Unit) {
    out(a,b)
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3) { a, b ->
        val result = a + b
        if(result > 10) return@inlineLambda
        println("result : $result")
    }
    println("end of retFunc")
}