package chap07

/**
 * 추상클래스로부터 하위 클래스를 따로 생성하지 않고, 객체를 생성하려면 object를 사용해야 한다.
 * object 키워드 : 익명 객체를 생성할 수 있는 키워드.
 */

abstract class Printer {
    abstract fun print()
}

val myPrinter = object : Printer() {
    override fun print() {
        println("출력")
    }
}

fun main() {
    myPrinter.print()
}