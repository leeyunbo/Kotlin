package chap10

/**
 * 자바에서 함수 내부에서 외부 변수를 사용하기 위해서는 해당 변수가 final로 선언되어 있어야 함
 * 하지만 Kotlin은 final이 아니여도 가능, 대신 컴파일 하면 해당 변수가 final로 변환됨
 */
fun main() {
    val calc = CtCalc()
    var result = 0
    calc.addNum(2,3) { x ,y -> result = x + y }
    println(result)
}

class CtCalc {
    fun addNum(a : Int, b : Int, add : (Int,Int) -> Unit) {
        add(a,b)
    }
}