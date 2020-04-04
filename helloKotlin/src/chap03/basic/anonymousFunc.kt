package chap03.basic

fun main() {
    val add : (Int,Int) -> Int = fun(x,y) =  x + y
    val add2 = fun(x:Int,y:Int) = x+y
    val add3 = { x:Int, y:Int -> x + y}

    val result = add(3,5)
    println(result)
    shortFunc(3) {
        println("First Call : &it")
    }

    val multi = 3 multiply 10
    println(multi)
}

inline fun shortFunc(a : Int, crossinline out : (Int) -> Unit) {
    println("Before calling out()")
    nestedFunc { out(a) } //nestedFunc때문에 비지역 반환을 금지해야함. 따라서 out을 crossinline으로 선언 (비지역 반환 금지)
    println("After calling out()")
}

fun nestedFunc(body : () -> Unit) {
    body()
}

infix fun Int.multiply(x : Int) : Int { //Int 확장 메서드 추가, 중위표현식(1. 확장 or 멤버 메서드여야한다 2. 인자가 1개 여야 한다. 3. infix 키워드를 사용해야 한다)
    return this * x
}