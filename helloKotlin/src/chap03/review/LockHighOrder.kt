package chap03.review

import java.util.concurrent.locks.ReentrantLock

/**
 *  고차함수를 이용한 동기화 예제
 *  전역변수로 선언된 sharable 변수는 스레드들이 동시에 접근할 수 있는 Thread-Unsafe 변수임
 *  따라서 sharable 변수에 접근하는 루틴을 동기화를 해줘야함
 *  제네릭 함수인 lock을 만들어, 매개변수로 받는 함수에 대하여 보호할 수 있도록 구현함
 */

var sharable = 1

fun main() {
    val reLock = ReentrantLock()
    lock(reLock) { criticalFunc() }
}

private fun criticalFunc() {
    sharable += 1
}

private fun <T> lock(reLock : ReentrantLock, body: ()->T): T {
    reLock.lock()
    try {
        return body()
    } finally {
        reLock.unlock()
    }
}