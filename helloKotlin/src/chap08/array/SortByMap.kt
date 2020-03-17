package chap08.array

/**
 * 메서드 체이닝 예제. 각 결과를 it으로 넘겨받아서 사용하는 방식.
 * 다만, 중간의 메서드에서 에러가 발생하면 디버깅하기 어렵기 때문에 주의할 필요가 있음.
 */
fun main() {
    val fruits = arrayOf("banana", "avocado", "apple", "kiwi")
    fruits
        .filter { it.startsWith("a")}
        .sortedBy { it }
        .map {it.toUpperCase()}
        .forEach{println(it)}
}