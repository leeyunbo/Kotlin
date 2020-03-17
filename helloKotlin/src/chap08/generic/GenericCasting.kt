package chap08.generic

/**
 * 제네릭 클래스의 형식 매개변수인 T에 상, 하위 클래스를 지정하더라도 서로 관련이 없는 형식이 되기 때문에
 * 형식이 일치하지 않다는 오류가 발생합니다.
 */
open class Parent

class Child : Parent()

class Cup<T>

fun main() {
    val obj1 : Parent = Child()
    //val obj2 : Child = Parent() 불가능

    // val obj3 : Cup<Parent> = Cup<Child>() => 불가능. 자료형 불일치

    val obj5 = Cup<Child>()
    val obj6 : Cup<Child> = obj5
}
