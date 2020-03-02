package chap03.section1.paramfunc

fun main() {
    oneParams({a : String -> "Hello World $a"})
    oneParams {"Hello World $it"}

}

fun oneParams(out : (String) -> String) {
    println(out("OneParam"))
}

