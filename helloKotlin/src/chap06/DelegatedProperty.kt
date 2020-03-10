package chap06

import kotlin.properties.Delegates

/**
 * observable() 메서드 사용 예제
 * name에게 observable 메서드를 위임하며, 초깃값은 "NONAME"
 * 만약 user.name 프로퍼티에 변화가 발생하면 observable 메서드의 코드가 수행
 */
class DUser {
    var name : String by Delegates.observable("NONAME") {
        prop,old,new -> //프로퍼티, old value, new value 인자
        println("$old -> $new")
    }
}

fun main() {
    val user = DUser()
    user.name = "kildong"
    user.name = "Dooly"
}