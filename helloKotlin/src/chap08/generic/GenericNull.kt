package chap08.generic

/**
 * 형식 매개변수 T는 기본적으로 null을 허용하기 때문에 Int?와 같이 null을 허용하는 자료형을 사용할 수 있음
 * 안전한 작업을 위해 null을 비교하게 될 경우 equals() 메서드는 null을 리턴함
 *
 * null을 제한하기 위해서는 T : Any와 같이 특정 자료형으로 제한을 해놔야함
 */
class GenericNull<T> {
    fun EqualityFunc(arg1 : T, arg2 : T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = GenericNull<String>()
    obj.EqualityFunc("Hello", "World")

    val obj2 = GenericNull<Int?>()
    obj2.EqualityFunc(null,10)
}