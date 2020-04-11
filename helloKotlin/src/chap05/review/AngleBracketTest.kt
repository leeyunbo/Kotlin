package chap05.review
/**
 *
 * super<상속받은 클래스 및 인터페이스 명>.메서드 및 프로퍼티 => 다중 상속받았을 때 이런식으로 자신이 원하는 부모의 멤버를 호출할 수 있음
 *
 */
open class A {
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}

interface B {
    fun f() = println("B Interface f()")
    fun b() = println("B Interface b()")
}

class C : A(), B {
    override fun f() = println("C Class f()")

    fun test() {
        f()
        b()
        super<A>.f()
        super<B>.f()
    }
}

fun main() {
    val c = C()
    c.test()
}