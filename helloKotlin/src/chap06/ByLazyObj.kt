package chap06
class LPerson(val name : String, val age : Int)
fun main() {
    var isPersonInstantiated : Boolean = false

    val person : LPerson by lazy {
        isPersonInstantiated = true
        LPerson("kim", 23)
    }
    val personDelegate = lazy { LPerson("Hong", 40) }

    println("person init : $isPersonInstantiated")
    println("personDelegate Init : ${personDelegate.value.name}")

    println("person.name = ${person.name}")
    println("personDelegate.value.name = ${personDelegate.value.name}")

    println("person Init : $isPersonInstantiated")
    println("personDelegate Init : ${personDelegate.isInitialized()}")
}