package chap02

/**
 * bit 연산자. shl => shift Left로 곱하기 2를 한것과 같음
 *            shr => shift Right으로 나누기 2를 한것과 같음
 *            inv => 모든 비트를 반전시킴
 */
fun main() {
    var x = 4
    var y = 0b0000_1010
    var z = 0x0F

    println(x shl 2)
    println(x shr 2)
    println(x.inv())

    println(y shr 2)
    println(x shl 4)
    println(z shl 4)

    x = 64
    println(x shr 2)
}