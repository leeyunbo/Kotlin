package chap02

/**
 * Any형은 자료형이 특별히 정해지지 않았을 때 사용
 * Any형은 Java의 Object 처럼 모든 클래스의 뿌리이다. 따라서 Any형은 어떤 자료형으로도 자동 형변환 할 수 있다.(묵시적 형변환)
 */
fun main() {
    checkArgs("Hello")
    checkArgs(5)
}

fun checkArgs(arg : Any) {
    if(arg is String) {
        println("String")
    }

    if(arg is Int) {
        println("Int")
    }
}