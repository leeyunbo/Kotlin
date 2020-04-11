package chap05.review

/**
 * 특정 클래스 안에 선언된 클래스를 이너 클래스라고 함
 * 이너 클래스에서 바깥 클래스의 상위 클래스를 사용하려면 super@바깥클래스.x 이런 식으로 접근 해줘야 함
 */
private open class Base {
    open val x: Int = 1
    open fun f() = println("Base Class f()")
}

private class Child : Base() {
    override val x: Int = super.x + 1
    override fun f() = println("Child class f()")

    inner class Inside {
        fun f() = println("Inside class f()")
        fun test() {
            f()
            Child().f()
            super@Child.f()
            println("[Inside] super@Child.x : ${super@Child.x}")
        }
    }
}

fun main() {
    val c1 = Child()
    c1.Inside().test()
}
