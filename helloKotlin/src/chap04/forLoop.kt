package chap04

fun main() {
    var x : Int = 0
    for(x in 1..5) {
        println(x)
    }
    var i = 0
    for(x in 5 downTo 1) println(x)

    for(x in 1..10 step 2) println(x)
    for(x in 10 downTo 1 step 2) println(x)


}