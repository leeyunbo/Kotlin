package chap06

import kotlin.properties.Delegates

/**
 * vetoable 메서드 사용 예제
 * observable 메서드와 다르게, 새로운 값이 조건에 맞지 않으면 프로퍼티 변경 거부
 * vetoable 메서드는 내부에 존재하는 콜백 메서드인 onChange() 메서드가 true or false를 리턴하여, true여야만 값을 변경
 * observable 메서드는 onChange() 메서드가 호출되었을 때는 이미 값이 변경된 이후
 * new != old 이런식으로, new와 old값이 다르면 할당 작업을 거부함으로써 오버헤드를 방지할 수도 있음
 */
fun main() {
    var max : Int by Delegates.vetoable(0) {
        prop, old, new ->
        new > old //조건에 맞지 않으면 거부
    }

    println(max)
    max = 10
    println(10)

    max = 5
    println(max)
}
