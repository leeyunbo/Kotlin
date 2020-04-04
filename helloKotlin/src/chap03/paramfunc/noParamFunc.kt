package chap03.paramfunc

fun main() {

    noParams { println("hello World") }
    noParams2 { "hello World" }
}

fun noParams(out : () -> Unit) = out()
fun noParams2(out : () -> String) = println(out())