package chap11

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

/**
 * 채널에는 기본 버퍼가 없으므로, 만약 send() 함수가 먼저 호출되면 receive() 함수가 호출될 때 까지 send()는 지연됨
 * 반대의 경우에도 마찬가지.
 * 하지만 만약에 채널에 버퍼 크기를 지정해주면 지연 없이 여러 요소를 전송할 수 있음
 */
fun main() = runBlocking {
    val channel = Channel<Int>(3)
    val sender = launch(coroutineContext) {
        repeat(10) {
            println("Sending $it")
            channel.send(it)
        } // 버퍼 크기가 3이므로, 일시정지. receive호출이 있을때까지!
    }
    delay(1000)
    sender.cancel()
}