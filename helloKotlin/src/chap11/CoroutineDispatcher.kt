package chap11

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val jobs = arrayListOf<Job>()
    /**
     * 메인 스레드에서 작업
     * 호출자 스레드에서 코루틴을 시작하지만, 첫 번째 지연점까지만 실행. 특정 스레드나 풀에 가두지 않고 일시 중단 후 호출된 지연 함수에 의해 재개
     * 이 옵션은 권장X 기억하지말자
     */
    jobs += launch(Dispatchers.Unconfined) {
        println("Unconfined:\t\t ${Thread.currentThread().name}")
    }
    // 부모의 문맥을 따라간다. 여기서는 runBlocking의 문맥
    jobs += launch(coroutineContext) {
        println("coroutineContext:\t\t ${Thread.currentThread().name}")
    }
    /**
     * 디스패처의 기본값
     * 기본 문맥인 CommonPool에서 실행되고 GlobalScope로도 표현. 즉, GlobalScope.launch와 같은 표현임.
     * 이것은 공유된 백그라운드 스레드의 CommonPool에서 코루틴을 실실행하록 함. 다시 말하면 스레드를 생성하지 않고 기존에 있는 것을 이용한다.
     * 따라서 연산 중심의 코드에 적합
     */
    jobs += launch(Dispatchers.Default) {
        println("Default:\t\t ${Thread.currentThread().name}")
    }
    /**
     * 입출력 중심의 문맥
     * 입출력 위주의 동작을 하는 코드에 적합한 공유된 풀. 따라서 블로킹 동작이 많은 파일이나, 소켓 I/O 처리에 사용하면 조음
     */
    jobs += launch(Dispatchers.IO) {
        println("IO:\t\t ${Thread.currentThread().name}")
    }
    // 아무런 인자가 없을 때
    jobs += launch {
        println("main runBlocking : ${Thread.currentThread().name}")
    }
    /**
     * 새 스레드 생성
     * 사용자가 직접 새 스레드 풀을 만들 수 있음. 새 스레드를 만들기 때문에 비용이 많이 들고 더 이상 필요하지 않다면 취소해야함
     * 코루틴 안에 또 다른 코루틴을 정의하면 자식 코루틴. 부모가 취소되는 경우 자식도 재귀적으로 취소됨
     * 따라서 필요한 경우 명시적으로 join()을 이용하여 부모를 기다리게 해야함
     */
    jobs += launch(newSingleThreadContext("MyThread")) {
       println("MyThread:\t\t ${Thread.currentThread().name}")
    }
    jobs.forEach { it.join() }
}