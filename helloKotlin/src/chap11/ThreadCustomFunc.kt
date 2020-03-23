package chap11

/**
 * 스레드가 가지고 있는 각종 옵션 변수를 쉽게 지정할 수 있도록 함수를 만들어
 * 손쉽게 옵션을 지정하여 생성할 수 있다.
 */
public fun thread(start : Boolean = true,
                  isDaemon : Boolean = false,
                  contextClassLoader : ClassLoader? = null,
                  name : String? = null,
                  priority : Int = -1,
                  block : () -> Unit) : Thread {
    val thread = object : Thread() {
        override fun run() {
            block()
        }
    }
    if(isDaemon)
        thread.isDaemon = true
    if(priority > 0)
        thread.priority = priority
    if(name != null)
        thread.name = name
    if(contextClassLoader != null)
        thread.contextClassLoader = contextClassLoader
    if(start)
        thread.start()
    return thread
}

fun main() {
    thread(start = true) {
        println("Current Threads(Custom Function) : ${Thread.currentThread()}")
        println("Priority : ${Thread.currentThread().priority}")
        println("Name : ${Thread.currentThread().name}")
        println("Name : ${Thread.currentThread().isDaemon}") //데몬 스레드 지정 여부, 데몬 스레드는 운영체제에 의해 낮은 우선순위가 부여
    }
}