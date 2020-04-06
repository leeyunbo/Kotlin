package chap03.review

/**
 * inline 함수는 호출한 함수에 코드가 복사되어 실행된다.
 * 따라서 함수에서 다른 함수로 이동할 때의 분기 오버헤드가 존재하지 않는다.
 * 인라인 함수가 너무 많이 호출되면 코드가 쓸데 없이 길어져서 성능에 문제가 생길 수도 있다.
 * 만약 인자로 람다식을 받게되면 그 람다식도 인라인 함수의 영향을 받아 복사되어 코드가 쓸데 없이 길어진다
 * 그때 해당 인자를 noinline으로 만들어주면 복사가 되지 않는다.
 */
fun main() {
    shortFunc(3){println(it)}
    shortFunc(4){println(it)}
    noInlineShortFunc(5){ println(it) }
}

private inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before")
    out(a)
    println("After")
}

private inline fun noInlineShortFunc(a: Int, noinline out: (Int) -> Unit) {
    println("Before")
    out(a)
    println("After")
}