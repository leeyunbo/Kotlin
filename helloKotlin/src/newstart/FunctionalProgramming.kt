package newstart

fun main() {
    highFunc({x,y -> x + y}, 1, 3)
}

private fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int = sum(a,b)