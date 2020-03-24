package chap11
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/**
 * CoroutineStart.LAZY => 지연된 시작, await가 호출된 시점에 async() 메서드가 실행됨
 */
fun main() = runBlocking {
    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) { doWork1() }
        val two = async(start = CoroutineStart.LAZY) { doWork2() }
        println("AWAIT : ${one.await() + "_" + two.await()}")
    }
    println("Completed in $time ms")
}