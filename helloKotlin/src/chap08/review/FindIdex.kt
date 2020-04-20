package chap08.review

import chap08.generic.InterfaceA
import chap08.generic.InterfaceB

/**
 * 제네릭 타입은 컴파일 시간에 결정되므로, 만약 연산할 경우 리턴타입을 확실히 하지 못함(연산은 실행시간에 일어나므로!)
 * 이때, 람다식을 매개변수로 받으면 자료형을 결정하지 않아도 실행 시 람다식 본문으로 넘겨질 때 결정되므로 가능하다.
 *
 * 추가) 제네릭 자료형: 제한할 타입 하면, 타입을 한정시킬 수 있음
 * ex) <T: Number> => Number를 상속받는 자식들 or Number 타입만 가능
 *
 * 추가) 만약 여러 자료형을 제한하려면?, where 키워드 사용!
 * ex) class ClassA<T> where T:InterfaceA, T:InterfaceB
 */
fun <T> find (list : List<T>, Target : T) : Int {
    list.forEachIndexed { index, element ->
        if(element == Target) return index
    }
    return -1
}

fun <T: Number> add (a: T, b: T, op: (T,T) -> T): T {
    return op(a,b)
}

class HandlerA: InterfaceA, InterfaceB

class ClassA<T> where T:InterfaceA, T:InterfaceB


fun main() {
    val arr1: List<String> = listOf("Apple","Banana")
    val arr2: List<Int> = listOf(1,2,3,4)

    println(find<String>(arr1, "Apple"))
    println(find<Int>(arr2, 3))

    println(add(1,2,{a,b -> a+b}))
}