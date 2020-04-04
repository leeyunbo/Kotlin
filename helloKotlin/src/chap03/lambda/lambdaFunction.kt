package chap03.lambda

fun main() {
    val greet : () -> Unit = {println("hello")}
    // => val greet = {println("hello")}
    val multi = {x: Int, y : Int -> x * y}
    val multi2 = {x : Int, y : Int ->
        print("x * y = ")
        x * y
    }
    val nestedLambda : () -> () -> Unit = {{println("hello nested")}}
    // => val nestedLambda = {{println("hello nested")}}

    println(multi(3,4))
    println(multi2(3,4))
    println(greet())
    println(nestedLambda()())
}