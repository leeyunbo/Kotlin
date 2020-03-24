package chap11

import kotlinx.coroutines.*

/**
 * async에 의해 감싸져 있으면 완전히 병행 수행이 가능. 따라서 DoWork1이 먼저 시작되었지만, 1초 Delay로 인해 DoWork2가 먼저 종료됨
 * await() 메서드를 이용하여 비동기 루틴들이 종료될 때 까지 기다렸다가 반환값을 받을 수 있음
 *
 * UI Thread에서 블로킹 가능성이 있는 코드를 작성하면 문제가 생기는데 이때 await을 사용하면, UI Thread(메인 스레드)를 제외한 루틴만 블로킹됨
 */
suspend fun asyncDoWork1() : String {
    println("Work1 Start")
    delay(1000)
    println("Work1 Finish")
    return "Work1"
}

suspend fun asyncDoWork2() : String {
    println("Work2 Start")
    println("Work2 Finish")
    return "Work2"
}

private fun worksInParallel() {
    val one = GlobalScope.async {
        asyncDoWork1()
    }
    val two = GlobalScope.async {
        asyncDoWork2()
    }

    GlobalScope.launch {
        val combined = one.await()+"_"+two.await()
        println(combined)
    }
}

fun main() {
    worksInParallel()
    println("main() Method")
    readLine()
}