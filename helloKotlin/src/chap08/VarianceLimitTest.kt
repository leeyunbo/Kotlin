package chap08

/**
 * 공변성(out), 반공변성(int), 무변성에 대한 예제
 * out 형식은 반환 자료형에는 이용할 수 있지만(get), 일반적인 메서드 매개변수로는 이용할 수 없으며(set)
 * 메서드의 매개변수로 이용하기 위해서는 in 형식이 필요하다.
 * out을 사용하는 경우에 형식 매개변수를 갖는 프로퍼티는 val만 허용한다. var 형식으로 프로퍼티를 선언하기 위해서는
 * private로 지정해줘야 한다. (val element : T -> private var element : T)
 *
 * out과 in을 이용하여 자료형에 제한을 두는 것을 자료형 프로젝션이라고 한다.
 * 만약 어떠한 자료형에 out을 명시한다면, 그 자료형의 데이터를 수정할 수 없도록 제한을 둘 수 있다.
 */
open class Animal(val size : Int) {
    fun feed() = println("Feeding")
}

class Cat(val jump : Int) : Animal(50)
class Spider(val position : Boolean) : Animal(1)

class VBox <out T : Animal>(val element: T) {
    // var 형식으로 element를 선언하기 위해서는 private var element : T
    fun getAnimal() : T = element
   // fun set(new : T) {       out 형식은 반환 자료형에는 이용할 수 있지만, 특정 메서드의 매개변수로는 이용할 수없음. in 형식이 필요!
    //   element = new
   // }
}

fun main() {
    val c1 : Cat = Cat(10)
    val s1 : Spider = Spider(true)

    var a1 : Animal = c1
    a1 = s1
    println("a1.size = ${a1.size}")

    val c2 : VBox<Animal> = VBox<Cat>(Cat(10))
    println("c2.element.size = ${c2.element.size}")
}