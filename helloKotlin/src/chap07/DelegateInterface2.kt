package chap07

/**
 * 위임을 이용한 멤버 접근 예제
 */
interface Nameable {
    var name : String
}

class StaffName : Nameable {
    override var name : String = "Sean"
}

class Work : Runnable {
    override fun run() {
        println("work....")
    }
}

class Person(name : Nameable, work : Runnable) : Nameable by name, Runnable by work

fun main() {
    val person = Person(StaffName(), Work())
    println(person.name)
    person.run()
}