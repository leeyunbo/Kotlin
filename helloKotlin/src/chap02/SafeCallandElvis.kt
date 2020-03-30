package chap02

/**
 * ?: {결과 값} => Elvis 연산자, 만약 Null값이면 오른쪽 결과값을 반환한다.
 * 참조형 변수(객체)는 저장될 때 스택에 주소값이 저장되어 Heap에 데이터들이 저장된다. .. 참조형 변수 = 객체 인스턴스
 * 반면에 기본 타입은 저장될 때 스택에 주소값이 저장되는 것이 아닌, 값이 저장된다.
 */

fun main() {
    var str1 : String? ="Hello Kotlin"
    str1 = null
    println("str1.length : ${str1?.length ?: -1}")

    val a : Int = 120
    val b : Int? = 120
    val c : Int = 120
    val d : Int? = 120
    println(a==b)
    println(a===b)
    println(b===d)
    println(a===c)
}