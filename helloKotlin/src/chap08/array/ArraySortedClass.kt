package chap08.array

/**
 * data class 정렬 예제
 * sortBy를 이용하여 정렬하였음
 * minBy, maxBy { 원하는 프로퍼티 } => 최소, 최대 객체를 반환한다.
 */
private data class Product(val name : String, val price : Double)

fun main() {
    val products = arrayOf(
        Product("snow Ball", 870.00),
        Product("smart Phone", 1000.00),
        Product("yunbok dinary", 99999999.00)
    )
    products.sortBy {it.price}
    products.forEach { println(it) }
    println(products.minBy { it.price })
    println(products.maxBy { it.price})
}