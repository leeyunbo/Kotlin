package chap11

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 단 몇 개의 스레드로 수많은 코루틴을 생성해 실행할 수 있기 때문에, 오류가 발생하지 않음(Out-Of-Memory)
 * repeat() 함수를 통해 수많은 코루틴 생성 가능
 */
fun main() = runBlocking {
    val jobs = List(100_000) {
        launch {
            delay(1000L)
            print(".")
        }
    }
    jobs.forEach { it.join() }

    repeat(100_000) {
        launch {
            delay(1000L)
            println("$")
        }
    }

    var jobs2 = List(100000) {
        launch { println(it + 2) }
    }
    jobs2.forEach { it.join() }

}