package chap11

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * launch 함수를 수행하면, 현재 스레드를 차단하지 않고 새로운 코루틴을 실행할 수 있게 함.
 * 특정 결과값 없이, Job 객체를 반환한다.
 * GlobalScope : 메인 스레드가 종료되면 코루틴도 죵로(코루틴의 생명주기가 프로그램의 생명주기에 의존)
 */
fun main() {
    val job = GlobalScope.launch {
        delay(1000L)
        println("World")
    }
    println("Hello")
    println("job.isActive : ${job.isActive}, completed : ${job.isCompleted}")
    Thread.sleep(2000L)
    println("job.isActive : ${job.isActive}, completed : ${job.isCompleted}")
}