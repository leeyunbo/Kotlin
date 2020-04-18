package chap07.review

/**
 * 다른 객체 지향 언어와 다르게 코틀린에서의 interface는 구현 메서드를 포함할 수 있음(자바에서는 default 메서드를 통해 가능)
 *
 * Q. 추상 클래스와 용도가 비슷해보이는데 인터페이스는 왜 사용할까?
 * 추상 클래스는 기본적으로 클래스이기 때문에 상속을 통해 확장해나갈 수 있음, 하위 클래스는 상속을 하나만 허용하기 때문에 2개 이상의 클래스로부터 프로퍼티와 메서드를
 * 상속받을 수 없다는 단점이 있음. 그리고 상위 클래스와 하위 클래스 간 강한 연관이 생기면서 하위 클래스는 상위 클래스에게 영향을 받게 됨
 * 만약, 상위 클래스가 불완전하다면 하위 클래스도 그 영향을 받으며, 만약 상위 클래스가 수정되었을 때 하위 클래스를 일일이 확인하기 어려움
 *
 * 반면에 인터페이스는 클래스가 아니며, 보통 상속받는 것이 아닌 구현한다고 얘기함. 인터페이스는 구현 클래스와 강한 연관을 가지지 않는다.
 * 왜냐하면 상속은 하나만 허용했지만 인터페이스는 원하는 만큼 구현 클래스에 붙여서 필요한 메서드를 구현해 내면 됨, 즉 인터페이스가 바뀐다고 할지라도 그것을 구현하는 클래스에
 * 영향을 주지 않도록 할 수 있음
 *
 * Q. 자바의 default 메서드?
 * 자바의 인터페이스는 원래 구현된 메서드를 포함할 수 없었음
 * 만약 인터페이스에 여러 클래스가 사용해야하는 공통적인 메서드가 포함되어있었다면 그것을 모든 클래스가 직접 구현해야하는 비효율적인 작업을 해야만 했음
 * 그래서 등장한 것이 default 메서드. 구현된 메서드를 추가할 수 있게 됨
 * 코틀린은 기본적으로 지원을 하므로 default가 따로 필요 없다.
 *
 * 추가) 인터페이스 활용 방법
 * 인터페이스를 이용하면 다형성을 증진시킬 수 있다.
 * Dog와 Cat이 인터페이스 Pet을 상속받음으로써, 메서드 인자로 Pet 타입으로 둘다 받을 수 있게 됨
 */

open class Animal(val name: String)

interface Pet {
    var category: String
    var species: String
    fun feeding()
    fun patting() {
        println("Kepp patting!")
    }
}

class Cat(override var category: String, override var species: String) : Pet {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

class Dog(override var category: String, override var species: String) : Pet {
    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master {
    fun playWithPet(pet: Pet) {
        println("Enjoy with my ${pet.species}.")
    }
}

fun main() {
    val obj = Cat("small", "cat")
    val obj2 = Dog("big","dog")
    val master = Master()

    master.playWithPet(obj)
    master.playWithPet(obj2)
}