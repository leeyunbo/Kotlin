package chap10

/**
 * apply() 함수는 also() 함수와 기능이 똑같다.
 * apply() 함수는 특정 객체를 생성하며 함께 호출해야 하는 초기화 코드가 있다면 사용한다.
 * apply() 함수는 it을 생략이 가능하다!..(this로 인자를 받아서 사용하기 때문!)
 */
fun main() {
    data class ApPerson(var name : String, var skills : String)
    var person = ApPerson("Kildong", "Kotlin")
    person.apply { this.skills = "Swift" }
    println(person)

    val returnObj = person.apply {
        name = "Sean"
        skills = "Java"
    }
    println(person)
    println(returnObj)
}