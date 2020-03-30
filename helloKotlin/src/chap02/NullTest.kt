package chap02

/**
 * 변수에 Null 값을 넣기 위해서는 타입 뒤에 ?를 붙여야함
 * 만약 변수가 Null을 넣을 수 있는 타입이라면, 어떤 함수를 호출할 때 ?.(세이프콜) 혹은 !!.(단정 기호)를 사용해야한다.
 * 만약 세이프콜을 사용했을 때 Null값이라면 결과값으로 Null 리턴, !!. 단정기호는 그냥 진행후 NPE 에러를 출력(Null 값을 검사하지 않음!)
 */

fun main() {
    var str1 : String? = "Hello Kotlin"
    str1 = null
    println("str1 : $str1")
    println("str1.length : ${str1?.length}")
}