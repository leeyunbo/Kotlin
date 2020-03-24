package chap11

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

/**
 * 채널은 자료를 서로 주고받기 위해 약속된 일종의 통로 역할
 * 코루틴의 채널은 넌 블로킹 전송 개념으로 사용되고 있음
 * 채널을 구현할 때는 SendChannel, ReceiveChannel 인터페이스를 이용해 값들의 스트림을 전송하는 방식을 제공
 * 일반 큐와 다르게 채널은 전송, 수신이 완료된 후 닫을 수 있음
 */
fun main() = runBlocking {
    val channel = Channel<Int>()
    val jobs = mutableListOf<Job>()
    jobs.add(
        launch {
            println("launch")
            for (x in 1..5) channel.send(x * x)
            println("1. Channel Send Finish")
            channel.send(5)
            println("2. Channel Send Finish")
            channel.close()
        })
    println("main")
    repeat(6) {println(channel.receive())}
    println("Done!")

}