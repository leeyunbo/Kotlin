package chap08

/**
 * 컴파일 전에 인자의 자료형을 고정할 수 없거나 예측할 수 없을 때 제네릭 타입을 사용하면
 * 실행 시간에 자료형을 결정할 수 있어서 굉장히 편리하다. (인스턴스 생성 시점)
 *
 * 장점
 * 1. 의도하지 않은 자료형의 객체를 지정하는 것을 막을 수 있다.
 * 2. 원래의 자료형에서 다른 자료형으로 형 변환시 발생할 수 있는 오류를 줄여준다.
 */
class Box<T>{
    var name : T  //프로퍼티에 형식 매개변수(T)를 사용하기 위해서는 생성자에서 초기화를 시켜줘야함.
    constructor(_name : T) {
        name = _name
    }
}

fun main() {
    val box1 : Box<Int> = Box<Int>(1)
    val box2 : Box<String> = Box<String>("Hello")
}