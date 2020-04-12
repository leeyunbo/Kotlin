package chap06.review


/**
 *  by lazy는 객체를 맡기는 느낌임, 따라서 마지막에 객체를 반환을 해줌
 *  반면에 lazy는 맡기는게 아니라, 내가 직접 하기 위해 Lazy객체를 직접 받아 수행함, 따라서 .value로 해당 객체에 접근을 해야함
 */

class person(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false

    val person: person by lazy {
        isPersonInstantiated = true
        person("Kim", 23)
    }
    val personDelegate = lazy { person("Hong", 40) }



    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.value.name}")

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}