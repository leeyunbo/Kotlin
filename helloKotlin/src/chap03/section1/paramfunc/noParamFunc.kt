package chap03.section1.paramfunc

fun main() {

    noParams { println("hello World") }
    noParams2 { "hello World" }
}

fun noParams(out : () -> Unit) = out()
fun noParams2(out : () -> String) = println(out())