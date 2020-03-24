package chap11
import kotlinx.coroutines.*

/**
 * finally 구문을 통해 코루틴의 종료 과정을 처리할 수 있음
 * cancelAndJoin : 작업을 취소하고 뒷정리 할 때 까지 대기
 * finally 블록에서 지연 함수를 사용하려고 하면 코루틴이 취소됨 따라서 지연 함수 사용X (왜냐면 코루틴은 종료된 후에 finally를 호출하니까)
 * 만약 지연 함수나 시간 걸리는 작업을 finally 블록에서 수행하기 위해서는 withContext(NonCancellable){} 블록을 사용해야함
 */
fun main() = runBlocking<Unit> {
    val job = launch {
        try {
            repeat(1000) { i ->
                println("I'm Sleeping $i....")
                delay(500L)
            }
        } finally {
            withContext(NonCancellable) {
                println("Bye!")
                delay(1000L)
            }
        }
    }
    delay(1300L)
    job.cancelAndJoin()
    println("main : Quit!")
}