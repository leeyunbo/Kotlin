package chap06

/**
 * object 선언과 달리 표현식은 이름이 없으며 싱글톤이 아니다.
 * object 표현식이 사용될 때마다 새로운 인스턴스가 생성된다.
 */
open class Superman() {
    fun work() = println("taking photos")
    fun talk() = println("talking with people")
    open fun fly() = println("flying in the air")
}

fun main() {
    val pretendedMan = object : Superman() {
        override fun fly() = println("I'm not a real superman. I can't fly")
    }
    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()
}