package chap08

/**
 * 타입 변수의 자료형 제한에 대한 예제
 * T : Number => Number 자료형으로 제한한다.
 * where T :InterfaceA, T: IneterfaceB // 두개 이상의 조건으로 제한하기 위해서는 where 사용. interfaceA,interfaceB를 구현한 클래스 타입만 허용한다.
 */

class Calculator<T : Number> { //자료형을 제한하기 위한 방법
    fun plus(arg1 : T, arg2 : T) : Double {
        return arg1.toDouble() + arg2.toDouble()
    }
}

fun <T : Number> calc(arg1 : T, arg2 : T) : Double { //제네릭 메서드의 경우
    return arg1.toDouble() + arg2.toDouble()
}

interface InterfaceA
interface InterfaceB
class HandlerA : InterfaceA,InterfaceB

class ClassA<T> where T:InterfaceA, T:InterfaceB //자료형을 두개 이상의 조건으로 제한하기 위해서는 where을 사용해야함.

fun<T> myMax(a : T, b : T) : T where T:Number, T:Comparable<T> { //제네릭 메서드의 경우
    return if(a>b) a else b
}

fun main() {
    val calc = Calculator<Int>()
    println(calc.plus(10,20))
    val calc2 = Calculator<Double>()
    val calc3 = Calculator<Long>()
    // val calc4 = Calculator<String>() .. 자료형이 Number로 제한되어있기 때문에 오류 발생

    val obj = ClassA<HandlerA>()
}