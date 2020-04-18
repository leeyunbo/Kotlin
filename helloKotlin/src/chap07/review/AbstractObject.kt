package chap07.review

/**
 * 추상 클래스를 상속 받지 않고, 단일 인스턴스로 객체를 생성하려면 object를 사용한다.
 * object는 익명 객체를 지정하는 키워드
 */

abstract class Printer {
    abstract fun print()
}

fun main() {
    val mPrinter = object: Printer() {
        override fun print() {
            println("mPrinter print...")
        }
    }

    mPrinter.print()
}