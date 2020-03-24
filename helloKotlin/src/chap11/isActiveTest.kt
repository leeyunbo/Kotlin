package chap11
import kotlinx.coroutines.*

/**
 * 연산이 마무리되기 전까지는 조건식에 의해 루틴이 중단되지 않는다.
 * job.cancelAndJoin()에 의해 루틴이 종료될 것 같지만 while문이 종료될 때 까지 중단되지 않음.
 * 취소 시그널을 받아 종료시키려면 while(i<5)를 while(isActive)로 변경
 */
fun main() = runBlocking<Unit>  {
    val startTime = System.currentTimeMillis()
    val job = GlobalScope.launch {
        var nextPrintTime = startTime
        var i = 0
        while(isActive) {
            if(System.currentTimeMillis() >= nextPrintTime) {
                println("I'm sleeping ${i++}")
                nextPrintTime += 500L
            }
        }
    }
    delay(1300L)
    println("main : im tired")
    job.cancelAndJoin()
    println("main : quit")
}