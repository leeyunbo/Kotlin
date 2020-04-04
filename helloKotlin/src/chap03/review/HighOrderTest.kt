package chap03.review

/**
 * 람다식을 변수에 저장하는 예제
 * 자동 추론이 가능하다.
 */

fun main() {
    var result: Int
    val multi = {x: Int, y: Int -> x * y}
    result = multi(10,20)
    println(result)
    var result2 = highOrderT(multi, 10, 20)
    println(result2) 
}

fun highOrderT(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a,b)
}