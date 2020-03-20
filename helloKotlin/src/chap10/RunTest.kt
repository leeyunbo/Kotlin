package chap10

/**
 * run() 함수도 apply() 함수처럼 this를 인자로 받아 사용할 수 있지만
 * apply() 함수가 this 객체를 반환하는 반면에, run() 함수는 람다함수의 반환 데이터를 반환한다.
 */
fun main() {
    data class RtPerson(var name : String, var skills : String)
    var person = RtPerson("Kildong", "Kotlin")
    val returnObj = person.apply {
        this.name = "Sean"
        this.skills = "Java"
        "success"
    }
    println(person)
    println("returnObj : $returnObj")

    val returnObj2 = person.run {
        this.name="Dooly"
        this.skills="C#"
        "success"
    }
    println(person)
    println("returnObj2 : $returnObj2")
}