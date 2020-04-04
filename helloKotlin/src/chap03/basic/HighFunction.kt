package chap03.basic

fun highOrder(sum : (Int, Int) -> Int, a : Int, b : Int) : Int {
    return sum(a,b)
}

val otherLambda : () -> Boolean = {
    println("otherLambda function")
    true
}

private fun callByName(b : () -> Boolean) : Boolean {
    println("call By Name")
    return b()
}

fun myDiv(a : Int, b : Int) : Int = a / b

fun myDivmyDiv(div : (Int,Int) -> Int, a : Int, b : Int) : Int {
    return div(a,b)
}

fun main() {
    val result: Int
    result = highOrder({ x: Int, y: Int -> x + y }, 10, 20)
    println(result)
    callByName(otherLambda)

    val div = ::myDiv // 얘도 일반 함수로 가능
    // ::myDiv => { a, b -> myDiv(a,b) }
    myDivmyDiv(::myDiv, 3, 3) //인자로 넣는 함수가 람다 함수가 아니라면, ::을 붙이면 사용 가능
}