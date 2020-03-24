package chap11

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.selects.select
import java.util.*

/**
 * 다양한 채널에서 무언가 응답할 때, 각 채널의 실행 시간에 따라 결과가 달라질 수 있는데
 * 이때 select를 사용하면 표현식을 통해 결과를 받을 수 있음 
 */
fun main() = runBlocking {
    val routine1 = GlobalScope.produce {
        delay(Random().nextInt(1000).toLong())
        send("A")
    }

    val routine2 = GlobalScope.produce {
        delay(Random().nextInt(1000).toLong())
        send("B")
    }

    val result = select<String> {
        routine1.onReceive{ result -> result }
        routine2.onReceive{ result -> result }
    } //먼저 수행된 코루틴의 결과를 받음
    println("Result was $result")
}