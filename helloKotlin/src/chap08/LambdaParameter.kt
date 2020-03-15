package chap08

/**
 *  먄약 제네릭 메서드에서 인자들을 더하는 값을 리턴해주고 싶은 상황에 대한 예제이다.
 *  return a + b 바로 이렇게 해버리면, 아직 a와 b의 자료형을 결정할 수 없기 때문에 오류가 발생한다.(리턴값을 결정할 수 없으니까!)
 *  하지만 람다식을 인자로 넘겨주게 되면, 람다식 본문을 넘겨줄때 자료형이 결정되므로, 이렇게 하면 된다!!!!!!!
 */
typealias arithmetic<T> = (T,T) -> T

fun <T> add(a : T, b : T, op : arithmetic<T>) : T {
    return op(a,b)
}

fun main() {
    val result = add("hello"," bye", {a, b -> a + b})
    println(result)
}