package chap07

/**
 * 연산자 오버로딩에 대한 예제 (p344)
 * 연산자 별로 함수가 존재하기 때문에 오버로딩이 가능하다.
 */

class Point(var x : Int = 0, var y : Int = 10) {
    operator fun plus(p : Point) : Point {
        return Point(x + p.x , y + p.y)
    }
    operator fun invoke(value : String) { //호출 연산자
        println(value)
    }
    override fun toString() : String {
        return "$x,$y"
    }
}

fun main() {
    val p1 = Point(3,-8)
    val p2 = Point(2,9)

    var point = Point()
    point = p1 + p2
    println(point.toString())

    p1("hello")
    p2("invoke")     // 호출 연산자, invoke가 생략!
}