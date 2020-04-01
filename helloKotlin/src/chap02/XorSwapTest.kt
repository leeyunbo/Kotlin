package chap02

/**
 * XOR 연산을 이용하여 SWAP 연산을 수행할 수 있다.
 */
fun main() {
    var number1 = 12
    var number2 = 25

    number1 = number1 xor number2
    number2 = number1 xor number2
    number1 = number1 xor number2

    println("number1 = ${number1}")
    println("nubmer2 = ${number2}")
}