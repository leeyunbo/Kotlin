package chap09

/**
 * 검사 함수에 대한 예제
 * list.all {람다 조건식} : 모든 요소들이 조건식에 true여야 true를 반환한다.
 * list.any {람다 조건식} : 최소한 하나의 요소가 조건식에 true이면 true를 반환한다.
 * list.none {람다 조건식} : 조건식에 해당되는 요소가 하나도 없으면 true를 반환한다.
 */
fun main() {
    val list = listOf(1,2,3,4,5,6)
    val list2 = listOf(1,2,3)
    val listPair = listOf(Pair("A",300), Pair("B",200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    println(list.all{ it < 10 })
    println(list.all{ it % 2 == 0})

    println(list.any{it % 2 ==0})

    println(list.contains(1))
    println(list.containsAll(list))
    println(list.none { it > 6 })

    println(map.contains(11))
    println(map.containsValue("Java"))
}