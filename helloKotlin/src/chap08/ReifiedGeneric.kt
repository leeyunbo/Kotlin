package chap08

/**
 * reified 덕분에 실행시간에 T에 직접 접근할 수 있음
 * 그로 인해서, T의 자료형을 확인할 수 있다.
 * reified는 inline 함수에만 사용이 가능하다.
 * => 컴파일러가 해당 함수를 호출 위치에 복사해서 넣을때 자료형을 확인하기 때문에 실행시간에도 접근이 가능하다.
 */
import java.lang.IllegalStateException

fun main() {
    val result = getType<Float>(10)
    println("result = $result")
}

inline fun <reified T> getType(value : Int) : T {
    println(T::class)
    println(T::class.java)

    return when(T::class) {
        Float::class -> value.toFloat() as T
        Int::class -> value as T
        else -> throw IllegalStateException("${T::class} is not supported!")
    }

}