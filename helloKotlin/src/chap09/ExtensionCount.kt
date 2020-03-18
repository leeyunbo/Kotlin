package chap09

/**
 * 확장 함수에 대한 예제
 * onEach는 forEach, forEachIndexed와 다르게 컬렉션을 반환한다.
 * count는 람다식 조건을 넣어줄 수 있다.
 */
fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listPair = listOf(Pair("A",300), Pair("B",200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    list.forEach { println("$it") }
    println()
    list.forEachIndexed{ index, value -> println("index[$index] : $value") }

    val returnedList = list.onEach {print(it)}
    println()
    val returnedMap = map.onEach {println("Key : ${it.key}, value : ${it.value}")}
    println(returnedList)
    println(returnedMap)

    println(list.count())
    println(list.count { it -> it % 2 == 0 }) //짝수인 요소의 갯수 리턴!

    println(list.max())
    println(list.min())
    println(map.maxBy{it.key})
    println(map.minBy{it.value})

    println(list.fold(4) { total,next -> total + next})
    println(list.fold(1) { total,next -> total * next})
    println(list.reduce{total,next -> total + next})
    println(list.reduce{total,next -> total * next})

    println(listPair.sumBy {it.second})
    println(list.sumBy {it})
}