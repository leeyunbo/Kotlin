package chap03.section1.lambda

//함수형 프로그래밍의 정의와 특징
//1. 순수 함수를 사용해야 한다.
//2. 람다식을 사용할 수 있다.
//3. 고차 함수를 사용할 수 있다.

// 다른 함수의 인자로 넘기는 함수
// 함수의 결괏값으로 반환하는 함수
// 변수에 저장하는 함수

// 함수형 프로그래밍에서는 함수를 일급 객체로 생각
// 일급객체 : 함수의 인자로 전달 가능, 반환값에 사용 가능, 변수에 담을 수 있다.
// 만약 이름이 없는 일급 함수인 경우, '람다식'이라고 부른다.

// 참조형 변수로 할당된 객체는 참조 변수는 스택에 있고, 객체는 힙에 있다. 참조형 객체는 함수에 전달될 때 참조된 주소가 복사되어 전달
// 근데, C,C++과 다르게 참조에 의한 호출은 없어, Call by Value밖에 없다. 단지, 참조형 객체가 전달될 때 주소가 전달되는 것이 아닌 데이터가 주소 값일 뿐이다.

fun mul(a : Int, b : Int) = a*b
fun highFunc(sum : (Int, Int) -> Int, a : Int, b : Int) : Int = sum(a,b) // 두 개의 Int 형 인자를 받고, Int형 값을 반환하는 일급함수를 받는 고차 함수
//고차 함수 : 다른 함수를 인자로 사용하거나, 함수를 결괏값으로 반환하는 함수 즉, 일급 객체 혹은 일급 함수를 서로 주고받을 수 있는 함수가 고차 함수
fun mulFunc_Connecter(a : Int, b : Int) = mul(a, b)  //고차함수, 일급함수를 반환 값으로 사용

fun callbyName(b : (Int, Int) -> Int)  {}
fun callbyValue(num : Int) {}
val out : (Int, Int) -> Int = {x : Int, y : Int -> x + y}    // val out = {println("Hello World")}

fun sumLambda(a : Int, b : Int) = a + b //람다가 아님, 이름에 의한 전달이 불가능.
fun funcParam(a : Int, b : Int, c : (Int, Int) -> Int) : Int {
    return c(a,b)
}
fun main() {

    var result : Int
    val multi = {x : Int, y : Int -> x * y} // (Int, Int) -> Int =.. 생략, 왜냐 자료형을 명시했으니까
    result = multi(10,20)
    println(result)
    println(
        mul(
            highFunc(
                { x, y -> x + y },
                10,
                20
            ), 30
        )
    ) //고차 함수, 일급 함수 인자로 사용

    callbyName(out)  // 함수의 이름을 전달 -
    callbyValue(
        out(
            3,
            5
        )
    ) //값에 의한 전달

    funcParam(3, 5, ::sumLambda) // :: 덕분에 인자와 리턴값이 같으므로 일반함수도 전달이 가능해짐 (이름으로)


}