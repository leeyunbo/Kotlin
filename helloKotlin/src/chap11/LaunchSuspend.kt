package chap11

import kotlinx.coroutines.*

/**
 * doWork1, doWork2는 순차적으로 진행됨!
 * worksInSerial()이 전체적으로 비동기적으로 봐야하는 거지 doWork1, doWork2가 개별적으로 비동기적으로 진행되는건 아님
 */
suspend fun doWork1() : String {
    println("Work1 Start")
    delay(1000)
    println("Work1 Finish")
    return "Work1"
}

suspend fun doWork2() : String {
    println("Work2 Start")
    println("Work2 Finish")
    return "Work2"
}

private fun worksInSerial() {
    GlobalScope.launch {
        val one = doWork1()
        val two = doWork2()
        println("Kotlin One : $one")
        println("Kotlin Two : $two")
    }
}

fun main() {
    worksInSerial()
    readLine() // main 스레드 종료 방지를 위하여, 콘솔에서 엔터키 입력 대기.
}