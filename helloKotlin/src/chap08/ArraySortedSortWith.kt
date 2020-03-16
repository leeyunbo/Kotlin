package chap08

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