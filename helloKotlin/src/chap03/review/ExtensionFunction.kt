package chap03.review

/**
 * 손쉽게 원하는 클래스에 확장 함수를 작성할 수 있다
 * 즉, 기존의 라이브러리를 수정하지 않고도 확장할 수 있는 기법
 */
fun main() {
    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))
}

fun String.getLongString(target: String) : String =
    if (this.length > target.length) this else target