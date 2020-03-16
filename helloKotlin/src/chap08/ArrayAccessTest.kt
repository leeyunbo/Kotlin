package chap08

import java.util.*

/**
 * Array에 대한 예제
 * arr[1] == arr.get(1)
 * (arr[1] = 2) == (arr.set(1,2))
 */
fun main() {
    val arr = intArrayOf(1,2,3,4,5)
    println("arr : ${Arrays.toString(arr)}")
    println("sum() : ${arr.sum()}")
    println("size : ${arr.size}")
    println(arr.get(2))
    println(arr[2])

    for(i in 0..arr.size-1) {
        println("arr[$i] = ${arr[i]}")
    }

}