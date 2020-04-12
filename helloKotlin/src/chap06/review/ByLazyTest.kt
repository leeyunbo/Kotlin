package chap06.review

/**
 * 최초로 접근 시점에 by lazy { }의 블록 부분의 초기화를 진행
 * val에서만 사용 가능, val이므로 값을 다시는 변경 불가
 * by는 프로퍼티를 위임할 때 사용
 */

class LazyTest {
    init {
        println("init block")
    }

    val subject by lazy {
        println("lazy Initialized")
        "Kotlin Programming"
    }
    fun flow() {
        println("not initialized")
        println("subject one : $subject")
        println("subject two : $subject")
    }
}

fun main() {
    val test = LazyTest()
    test.flow()
}