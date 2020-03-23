package chap11

import kotlinx.coroutines.*

/**
 * 코루틴의 기본예제
 * 코루틴 코드 부분은 메인 스레드와 연관 없이 넌블로킹 방식으로 실행
 * 따라서, 메인 스레드의 Hello,가 먼저 출력됨.
 * 메인 스레드가 JVM에서 바로 종료되지 않도록 Thread.sleep() 함수 호출.
 *
 * 코루틴에서 사용되는 함수는 suspend()로 선언된 지연 함수여야 사용 가능
 * delay() 함수같은 경우, 선언 부분을 보면 suspend로 선언됨
 * suspend 지연 함수의 의미는 사용자가 일시정지를 시킬 수 있음 따라서, 코루틴 블록(or 또 다른 지연 함수) 안에서 사용 가능!(메인 스레드에서는 사용 불가능)
 *
 */

suspend fun doSomething() {
    println("Do Something!")
}

fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    } // launch 함수 사용, 코루틴 빌더의 생성!
    println("Hello,")
    // doSomething() => ERROR!
    Thread.sleep(2000L)
}