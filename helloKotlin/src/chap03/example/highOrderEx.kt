package chap03.example

import java.util.concurrent.locks.ReentrantLock
var sharable : Int = 0

fun main() {
    val reLock = ReentrantLock()
    lock(reLock, ::criticalFunc)
    lock(reLock, ::criticalFunc)
    lock(reLock, { criticalFunc() })
    lock(reLock) { criticalFunc() }

    println(sharable)
}
fun <T> lock(reLock : ReentrantLock, body : () -> T) : T {
    reLock.lock()
    try {
        return body()
    } finally {
        reLock.unlock()
    }
}

fun criticalFunc() {
    sharable += 1
}