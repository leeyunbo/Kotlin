package chap06.review

/**
 * lateinit으로 선언 했더라도, 실행 시점 전에 초기화가 되지 않았다면 예외가 발생
 * var 변수에만 사용 가능, val 변수에 하려면 lazy 사용
 */

class Person {
    lateinit var name: String

    fun test() {
        if(!::name.isInitialized) {
            println("not Initialized")
        } else {
            println("Initialized")
        }
    }
}

fun main() {
    val kildong = Person()
    kildong.test()
    kildong.name = "Kildong"
    kildong.test()
    println("name = ${kildong.name}")
}