package chap09

import java.util.*
import kotlin.collections.HashMap

/**
 * sortedMap은 키에 대해 오름차순 정렬됨.
 */

fun main() {
    val hashMap : HashMap<Int, String> = hashMapOf(1 to "Hello", 2 to "World")
    println(hashMap)

    val sortedMap : SortedMap<Int, String> = sortedMapOf(1 to "Apple", 24 to "Banana", 5 to "Grape")
    println(sortedMap)

    val linkedHashMap : LinkedHashMap<Int, String> = linkedMapOf(1 to "Computer", 2 to "Mouse" , 4 to "Mouse", 3 to "Human")
    println(linkedHashMap)
}