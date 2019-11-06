package chap03.section1

fun main() {
    noParam({"Hello World!"})  // 여기 안에 매개변수로 전달된 람다함수는 String 반환. 출력 , 매개변수없는 함수라면 {} 이런식으로 표현이 가능하다., 소괄호는 생략이 가능
    hello(::noReturnFunc) //반환값이 없는 함수 ,인자와 반환값이 같은 매개변수인 함수면, ::으로 표현이 가능하다.
    """------------------------------------------------------------------------------------------------------------------"""
    oneParam({ a -> "Hello World! $a"})
    oneParam{ a-> "Hello World! $a"}
    oneParam{"Hello World $it"}
    """------------------------------------------------------------------------------------------------------------------"""
    moreParam({ a,b -> "Hello World! $a, $b"})
    moreParam{a,b -> "hello World! $a, $b"}                  //어디서든 소괄호는 생략이 가능하다.
    moreParam{_,b -> "Hello World $b"}                        //둘 중 하나의 인자를 사용하지 않으려면 "_" 기호로 생략이 가능하다.
    """------------------------------------------------------------------------------------------------------------------"""
    





}
fun moreParam(out : (String, String) -> String) {
    println(out("moreParam","moreParam"))
}
fun oneParam(out : (String) -> String) {
    println(out("OneParam"))
}

fun noParam(out : () -> String) = println(out()) // String을 반환하는 함수를 받아서, 출력해주는 함수
fun noReturnFunc(a : String, b : String) : String = "Hi!" //반환하는 값이 없음.
fun hello(body : (String, String) -> String) : Unit { //반환값이 없는데, String을 반환하는 함수를 받음
    println(body("Hello", "World"))
}