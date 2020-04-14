package chap06.review
/**
 * object 선언은 프로퍼티와 메서드를 객체 생성 없이 접근할 수 있다. 단일 인스턴스이기 때문에 싱글턴 패턴에서 사용된다
 * object 선언은 접근시에 객체가 생성되기 때문에, 생성자 호출을 하지 않는다. 초기화 블록인 init은 접근 시점에 수행된다.
 *
 * 자바에서 object를 접근하기 위해서는 INSTANCE를 사용한다 (OCustomer.INSTANCE.getName())
 */
object Ocustomer {
    var name = "Kildong"
    fun greeting() = println("Hello World")
    val HOBBY = Hobby("Basketball")
    init {
        println("init")
    }
}

class CCustomer {
    companion object {
        const val HELLO = "hello"
        var name = "Joosol"
        @JvmField val HOBBY = Hobby("Football")
        @JvmStatic fun greeting() = println("Hello World")
    }
}

class Hobby(val name: String)

fun main() {
    Ocustomer.greeting()
    Ocustomer.name ="Dooly"
    println("name : ${Ocustomer.name}")
    println(Ocustomer.HOBBY.name)

    CCustomer.greeting()
    println("name = ${CCustomer.name}, HELLO = ${CCustomer.HELLO}")
    println(CCustomer.HOBBY.name)
}