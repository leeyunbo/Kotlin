package chap08.array

import java.util.*

/**
 * 배열 정렬에 대한 예제
 * sortedArray .. 새로운 정렬된 배열 생성
 * sort().... 원본 배열 정렬
 * sorted().... List 형식으로 리턴
 * sortBy() .... 특정 표현식에 따라 정렬
 */
fun main() {
    val arr = arrayOf(8,4,3,2,5,9,1)
    val sortedNums = arr.sortedArray()
    println("ASC : " + Arrays.toString(sortedNums))

    val sortedNumsDesc = arr.sortedArrayDescending()
    println("DESC : " + Arrays.toString(sortedNumsDesc))

    arr.sort(1,3)
    println("ORI : " + Arrays.toString(arr))
    arr.sortDescending()
    println("ORI : " + Arrays.toString(arr))

    val listSorted : List<Int> = arr.sorted()
    val listDesc : List<Int> = arr.sortedDescending()
    println("LST: " + listSorted)
    println("LST: " + listDesc)

    val items = arrayOf<String>("Dog","Cat","Lion","Kangaroo","Po")
    items.sortBy {item -> item.length}
    println(Arrays.toString(items))
}