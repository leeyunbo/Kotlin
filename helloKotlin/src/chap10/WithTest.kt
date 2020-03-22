package chap10

/**
 * with(객체, 람다 함수) 함수는 인자로 받는 객체를 이어지는 람다 함수의 receiver로 전달하며, 람다 함수의 결과값을 반환한다.
 * with() 함수는 run() 함수와 기능이 거의 동일한데, run() 함수의 경우 run()함수를 호출한 객체를 처리하지만 , with() 함수는 receiver로 전달한 객체를 처리한다.
 * 즉, run()함수와 with()함수의 차이점은 객체의 위치이다.
 * with()함수는 세이프콜을 지원하지 않기 때문에, let() 함수와 같이 사용되기도 한다.
 */
fun main() {
    data class User(val name : String, var skills : String, var email : String? = null)
    val user = User("Kildong", "default")

    val result = with(user) {
        skills = "Kotlin"
        this.email = "Kildong@example.com"
        "Success"
    }
    println(user)
    println("result : $result")

    user?.let {
        with(it) {
            skills = "Kotlin"
            email = "Kildong@example.com"
            "Success"
        } //세이프콜을 지원하지 않아서, let과 함께 사용
    }
}