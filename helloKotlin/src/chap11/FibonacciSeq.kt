package chap11

/**
 * sequence 블록에서 지연 함수인 yield()를 호출하면서 코루틴을 생성
 * yield() 함수는 잠시 식을 계속 진행하기 전에, 잠시 멈추고 요소를 반환함. 이것은 값을 산출한다고 이야기할 수 이씀
 * 그리고 멈춘 시점에서 다시 실행을 재개. 즉, yield() 함수가 호출될 때마다 sequence 내부의 로직이 잠시 멈추고, 값을 반환한 후
 * 다시 그 위치부터 로직 진행을 재개함
 * toList로 가져온 데이터는 어딘가 저장되어 있지 않고 일회성임
 * 각 요소에 대해 접근하기 위해서는 iterator를 사용해야만 함 
 */
val fibonacciSeq = sequence {
    var a = 0
    var b = 1
    yield(1)

    while (true) {
        yield(a + b)
        val tmp = a + b
        a = b
        b = tmp
    }
}

/**
 * yieldAll()을 사용해 반복적으로 멈추게 되면서(결국 그자리에 범위를 만족할 때 까지, 멈춰져 있다는 의미)
 * 특정 범위의 값을 산출할 수 있음. generateSequence는 참고로 무한한 리스트.
 */
val seq = sequence {
    val start = 0
    yield(start)
    yieldAll(1..5 step 2)
    yieldAll(generateSequence(8) {it * 3})
}

fun main() {
    val saved = fibonacciSeq.iterator()
    println("${saved.next()},${saved.next()}")

    println(fibonacciSeq.take(8).toList())
    println(seq.take(25).toList())
}