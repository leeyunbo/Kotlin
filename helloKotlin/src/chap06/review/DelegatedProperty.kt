package chap06.review

import kotlin.properties.Delegates

/**
 * 프로퍼티의 값이 바뀌는지 관찰하는 콜백메서드 observable()
 * by를 통해 프로퍼티를 위임한다.
 */

class DUser {
    var name: String by Delegates.observable("NONAME") {
        prop,old,new ->
        println("$old -> new")
    }
}

fun main() {
    val user = DUser()
    while(true) {
        user.name = "Kildong"
        user.name = "Dooly"
    }
}

