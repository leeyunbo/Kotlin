package chap08

/**
 * comparator 객체를 이용하는 방법. 만약 오른쪽으로 갈꺼면 1, 왼쪽으로 갈꺼면 -1, 그대로 둘꺼면 0
 * compareBy를 이용하는 방법 => it.name, it.price를 인자로 넘겨줌으로써 두 가지 키에 의한 정렬이 구현됨. name이 우선
 */

private data class Products(val name : String, val price : Double)

fun main() {
    val products = arrayOf(
        Products("snow Ball", 870.00),
        Products("smart Phone",1000.00),
        Products("snow Ball",550.00),
        Products("yunbok dinary",9999.00),
        Products("smart Phone",50.00)
    )

    products.sortWith(
        Comparator<Products> { p1, p2 ->
            when {
                p1.price > p2.price -> 1
                p1.price == p2.price -> 0
                else -> -1
            }
        }
    )
    products.sortWith(compareBy({it.name}, {it.price}))
    products.forEach { println(it) }
}