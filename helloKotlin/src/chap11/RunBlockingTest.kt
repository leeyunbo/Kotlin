package chap11

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * runBlocking : 새로 생성된 코루틴이 완성될 때 까지, 현재 스레드를 블로킹함
 * 해당 예제에서는 mainThread를 블로킹중
 * Job 객체의 join 메서드를 활용하면 명시적으로 코루틴의 작업이 완료되는 것을 기다리게 할 수 있음
 */
fun main() = runBlocking<Unit> {
    val job = launch {
        delay(1000L)
        println("World!")
    }
    println("Hello")
    job.join() // 없어도 결과는 같음!
}