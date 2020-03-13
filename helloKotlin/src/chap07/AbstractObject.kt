package chap07

/**
 * 추상클래스로부터 하위 클래스를 따로 생성하지 않고, 객체를 생성하려면 object를 사용해야 한다.
 * object 키워드 : 익명 객체를 생성할 수 있는 키워드.
 */

abstract class Printer {
    abstract val name : String
    abstract val spec : String
    abstract fun print()
}

class myPrinter(override val name: String, override val spec: String) : Printer() {
    override fun print() {
        println("출력")
    }
    operator fun component1() = name
    operator fun component2() = spec
}

val myPrinters = object : Printer() {
    override val name: String = "SG-105"
    override val spec: String = "Color"
    override fun print() {
        println("출력")
    }
}

fun main() {
    val printer : myPrinter = myPrinter("1","COLOR")
    val printer2 : myPrinter = myPrinter("2","NOT COLOR")
    val printers = listOf(printer,printer2)

    for((name, spec) in printers) {
        println("$name $spec")
    }

    val myLamda = {
        (nameLa, specLa) : myPrinter ->
            println(nameLa)
            println(specLa)
    }
    myLamda(printer)
    myLamda(printer2)

    val myLamda2 : (Int,Int) -> Int = {a : Int, b : Int -> a+b}

}