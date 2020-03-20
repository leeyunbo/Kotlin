package chap10

import java.io.File

/**
 * public inline fun<T> T.also(block : (T) -> Unit) : T { block(this); return this }
 * Let() 은 결과를 리턴하는 반면에, also()는 선언한 객체를 리턴한다.
 * let과 also를 같이 혼용해서 많이 사용!
 *
  */
fun main() {
    data class Person(var name : String, var skills : String)
    var person = Person("Kildong", "Kotlin")
    val a = person.let {
        it.skills = "Android"
        "success"
    }
    println(person)
    println("a : $a")
    val b = person.also {
        it.skills = "Java"
        "success"
    }
    println(person)
    println("b : $b")
}

/**
 * also, let의 혼용 예제
 */
fun mkdir(path : String) : File {
    val result = File(path)
    result.mkdirs()
    return result
}

fun mkdir2(path : String) = path.let{File(it)}.also{it.mkdirs()}
fun mkdir3(path : String) = File(path).apply { mkdirs()}
fun mkdir4(path : String) = File(path).let{ it.mkdirs() }