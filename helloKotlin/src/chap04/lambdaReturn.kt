package chap04

fun main() {
    retFunc()
    fun greet() = {println("Hello")}
    fun greet2() = fun() {println("hello")}
    greet()()
    greet2()()
}

fun inlineLambda(a : Int, b : Int, out : (Int, Int) -> Unit) {
    out(a,b)
}

fun retFunc() { //@lit라벨을 사용하면 inline이 아닌 함수에서도
                // 매개변수인 lambda 함수가 return을 사용할 수 있음
                // 심지어 비지역반환도 아니라서 retFunc가 종료되지도 않고, lambda 함수만 종료!
                // 암묵적 라벨 : 빠져나갈 함수의 이름을 라벨로 사용 예) @inlineLambda ..결과는 밑의 코드에서 사용한 명시적 라벨과 똑같음
    println("start of retFunc")
    inlineLambda(13,3) lit@{a,b ->
        val result = a + b
        if(result > 10) return@lit
        println("result : $result")
    }
    println("end of retFunc")
}

fun retFunc2() {
    println("start of retFunc Using Anonymous Function")
    inlineLambda(13,3, fun(a,b) {
        val result = a + b
        if(result > 10) return
        println("result : $result")
    })
    println("end of retFunc")
}