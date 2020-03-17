package chap08.array

/**
 * 다차원 배열을 단일 배열로 만드는 것을 '배열을 평탄화 한다'라고 한다.
 * 그것에 대한 예제!
 *
 */
fun main() {
    val numbers = arrayOf(1,2,3)
    val strs = arrayOf("one","two","three")
    val simpleArray = arrayOf(numbers,strs)
    simpleArray.forEach{println(it)}

    val flattenSimpleArray = simpleArray.flatten()
    println(flattenSimpleArray)

}