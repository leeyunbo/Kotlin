package chap11

/**
 * 스레드 루틴을 구현하기 위해서는 Thread를 상속받거나, Runnable 인터페이스를 구현해야함
 * Thread 클래스를 상속 받으면, 타 클래스를 상속받을 수 없지만 Runnable 인터페이스를 구현하면 타 클래스를 상속 받을 수 있음
 *
 */
class SimpleThread : Thread() {
    override fun run() {
        println("Current Threads : ${Thread.currentThread()}")
    }
}

class SimpleRunnable : Runnable {
    override fun run() {
        println("Current Threads : ${Thread.currentThread()}")
    }
}


fun main() {
    val thread = SimpleThread()
    thread.start()

    val runnable = SimpleRunnable()
    val thread2 = Thread(runnable)
    thread2.start()

    object : Thread() {
        override fun run() {
            println("Current Threads : ${Thread.currentThread()}")
        }
    }.start()
}