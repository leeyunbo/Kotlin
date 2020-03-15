package chap08

fun <T> add(a : T, b : T, op : (T,T) -> T) : T {
   // return a + b 바로 이렇게 해버리면, 아직 a와 b의 자료형을 결정할 수 없기 때문에 오류가 발생한다.
    return op(a,b)
}

fun main() {
    val result = add("hello"," bye", {a, b -> a + b})
    println(result)
}