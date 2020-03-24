package chap11
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

/**
 * produce는 Channel이 붙어있는 코루틴이며, 생산자 측면의 코드를 쉽게 작성 가능
 * consumeEach는 ReceiveChannel의 확장 함수임
 * produce는 값을 생산하고, ReceiveChannel을 반환한다.
 */
fun CoroutineScope.producer() : ReceiveChannel<Int> = produce {
    var total : Int = 0
    for (x in 1..5) {
        total += x
        send(total)
    }
}

fun main() = runBlocking {
    val result = producer()
    result.consumeEach { print("$it ") }
}