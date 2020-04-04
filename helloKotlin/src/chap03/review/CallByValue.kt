package chap03.review

/**
 * 값에 의한 호출, 이름에 의한 호출 예제
 * 값에 의한 호출 : 람다식 함수가 값으로 처리되어, 그 람다 함수가 바로 수행된 후 값을 전달
 * 이름에 의한 호출 : 람다의 이름만 인자로 넘겨주게 되면, 바로 실행되는 것이 아니라 해당 함수 내부에서 호출 시에 실행됨
 *
 * 참조에 의한 호출 예제
 * 참조에 의한 호출 : 람다가 아닌 함수를 인자로 전달하려면, 일단 우선 인자와 리턴값이 같아야하며 함수 이름앞에 ::를 붙임으로써 전달할 수 있음
 */

fun main() {
    val result = callByValue(lambda())
    println(result)
    println(callByName(lambda))
    println(funcParam(3, 5, ::sum))
}

private fun callByValue(b: Boolean): Boolean {
    println("CallByValue Function")
    return b
}

private fun callByName(b: () -> Boolean) : Boolean {
    println("callByName()")
    return b()
}

private fun sum(a: Int, b: Int): Int {
    return a+b
}

private fun funcParam(a: Int, b: Int, c: (Int,Int) -> Int): Int {
    return c(a,b)
}

val lambda: () -> Boolean = {
    println("lambda function")
    true
}
