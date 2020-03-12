package chap07

/**
 * Interface 예제
 * 인터페이스는 추상클래스와 다르게 abstract을 붙여주지 않아도 기본적으로 abstract 프로퍼티, 메서드
 * 만약 메서드의 구현부를 작성하면 default 메서드로 지정됨
 * Interface는 abstract와 다르게 프로퍼티는 무조건 abstract로 지정됨.
 *
 *
 * 참고) Interface vs abstract
 * Interface와 abstract의 전체적인 흐름은 비슷함. 하지만 가장 큰 차이점은 Interface는 다중 구현이 가능하지만 abstract는 오직 단일 상속을 통해 구현이 가능함
 * Interface는 구현이고, abstract는 상속이라고 표현하는 이유는 일단 Interface는 클래스가 아니며 따라서 상속을 통해 자신의 멤버들을 물려주는게 아님.
 * 반면에 abstract는 클래스이며, 상속을 통해 자신의 멤버들을 물려줌
 * 이러한 이유때문에 abstract 클래스는 자신의 하위 클래스와 깊은 연관을 가지며, 만약 자신이 가진 멤버에 문제가 생긴다면 하위 클래스도 그대로 영향을 받을 수 있음
 *
 * 참고) Interface val 프로퍼티 get()
 * Interface에서는 프로퍼티에 값을 저장할 수 없다(abstract 필수!)라고 했는데, val로 선언된 프로퍼티의 경우 단순히 get을 통하여 반환값은 지정할 수 있음
 * 하지만 field를 사용할 수 없고, var로 프로퍼티를 선언하더라도 보조 필드를 사용할 수 없기 때문에 받은 value를 저장할 수 없음
 *
 */

open class Animal(val name : String)

interface Pet {
    var species : String
    var category : String
    val msgTags : String
        get() = "I'm your lovely pet!"
    fun feeding()
    fun patting() {
        println("Keep patting!")
    }
}

class Cat(name : String, override var category: String): Animal(name), Pet {
    override var species: String = "cat"
        get() = field
        set(value) {field = value}
    override fun feeding() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("Feed the cat a tuna can")
    }
}

class Dog(name : String, override var category: String) : Animal(name), Pet {
    override var species: String = "dog"
        get() = field
        set(value) {field = value}
    override fun feeding() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("Feed the dog a bone")
    }
}

class Master {
    fun playWithPet(pet : Pet) {
        println("Enjoy with my ${pet.species}")

    }
}

fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}