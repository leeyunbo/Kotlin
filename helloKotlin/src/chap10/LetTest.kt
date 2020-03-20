package chap10

/**
 * public inline fun <T, R> T.let(block : (T) -> R) : R = block(this)
 * 객체.let { 수행할 람다 }  : 객체를 그대로 인자로 넘겨서 람다 함수를 수행한다.
 *
 * 예를 들어,
 * val padding = 함수()
 * setPadding(padding)
 *
 * 이 구문을 let을 사용하게 되면
 * 함수().let { setPadding(it) } 람다함수의 인자가 한개이므로, it으로 대체 가능.
 * 이 가능하다. 즉, 쓸데없는 리소스 낭비를 줄일 수 있다.
 */
fun main() {
    val score : Int? = 32


    fun checkScore() {
        if(score != null) {
            println("score : $score")
        }
    }

    fun checkScoreLet() {
        score?.let { println("score : $it")} //score가 null이 아니면 실행 (if(score != null))
            ?: println("NullExceptionError") //?: =>  else 역할(엘비스 연산자)
        val str = score.let { it.toString() }
        println(str)
    }

    checkScore()
    checkScoreLet()
}
