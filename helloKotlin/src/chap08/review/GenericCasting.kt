package chap08.review
/**
 * Generic 클래스는 매개변수 T에 상위와 하위 클래스를 지정하더라도 서로 관련이 없는 형식이 되기 때문에
 * 자동 형변환이 이루어지지 않는다.
 * ex) val obj4: Cup<Child> = Cup<Parent> ==> X 불가
 * 변환이 가능하게 하려면 in, out에 대해 이해해야 한다.
 *
 * 타입매개변수 T는 기본적으로 null을 허용한다. 만약 null을 허용하지 않으려면 특정 자료형을 지정해야한다.
 * ex) class GenricNotnull(T: Any)
 */
open class Parent

class Child: Parent()

class Cup<T>

class GenericNotNull(T: Any) {

}

fun main() {
    val obj1: Parent = Child()
    val obj5 = Cup<Child>()
    val obj6: Cup<Child> = obj5
}