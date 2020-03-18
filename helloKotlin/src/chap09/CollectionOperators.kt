package chap09

/**
 * Collections들에 대한 연산 예제
 */
val list1 : List<String> = listOf("one", "two" ,"three")
val list2 : List<Int> = listOf(1,3,4)
val map1 = mapOf("h1" to 1, "hello" to 2, "goodbye" to 3)

fun main() {
    println(list1 + "four")
    println(list2 + 1)
    println(list2 + listOf(5,6,7))
    println(list2)
    println(list2 - 1)
    println(list2 - listOf(3,4,5))
    println(map1 + Pair("Bye",4))
    println(map1 - "hello")
    println(map1 + mapOf("Apple" to 4, "Orange" to 5))
    println(map1 - listOf("hi","hello"))
}