package chap07
/**
 * 코틀린의 중첩 클래스는 기본적으로 정적 클래스처럼 다뤄진다.
 * 따라서 중첩 클래스는 외부 클래스의 객체 생성없이 접근할 수 있다.(Static)
 * 또한 외부 메서드인 outside()에서 중첩 클래스의 멤버에 접근할 수 있다. 하지만 반대로 중첩 클래스에서는
 * 외부 클래스의 멤버인 ov에 접근할 수 없다.
 */
class Outer {
    val ov = 5
    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello! $nv"
        fun accessOuter() {
            getSomething()
            println(country)
        }
        //여기서 외부 클래스 Outer의 멤버에 접근할 수 없다.
        //하지만 companion object는 Static이기 때문에 접근할 수 있다.!(객체 생성없이 고정적인 메모리를 할당받기 때문에)
    }
    fun outside() {
        val msg = Nested().greeting()
        println("[Outer] : $msg, ${Nested().nv}")
    }

    companion object {
        const val country = "Korea"
        fun getSomething() = println("Get Something...")
    }
}

fun main() {
    val output = Outer.Nested().greeting()
    println(output)

    val outer = Outer()
    outer.outside()
}
