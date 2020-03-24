package chap11

import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

/**
 * withTimeout을 통해 일정 시간이 지난 후 루틴을 종료시킬 수 있다.
 * TimeoutCancellationException이 발생한다.
 */
fun main() = runBlocking {
    try {
        withTimeout(1300L) {
            repeat(1000) { i ->
                println("I'm sleeping $i...")
                delay(500L)
            }
        }
    } catch (e: TimeoutCancellationException) {
        println("time out with $e")
    }


    println("main : Hello runBlocking")


}