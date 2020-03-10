package chap06

class FakeAge {
    var age : Int = 0
        set(value) {
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value - 3
            }
        }
}

fun main() {
    val kim = FakeAge()
    kim.age = 15
    println(kim.age)

    val hong = FakeAge()
    hong.age = 35
    println(hong.age)
}