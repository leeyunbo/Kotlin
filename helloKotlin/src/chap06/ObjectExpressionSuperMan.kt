package chap06

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