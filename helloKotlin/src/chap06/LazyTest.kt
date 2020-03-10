package chap06

/**
 * Lazy 예제
 * $subject로 인해 최초로 프로퍼티에 접근될 때, Lazy initialized가 수행된다.
 */
class LazyTest {
    init {
        println("init block")
    }

    val subject by lazy {
        println("lazy initialized")
        "kotlin programming"
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