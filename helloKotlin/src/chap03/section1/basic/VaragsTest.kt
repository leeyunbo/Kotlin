package chap03.section1.basic

/**
 * 인자의 수가 확실치 않을 때 가변 인자를 사용하면 됨
 * 여기서 counts는 Int형 배열이 됨
 */
fun main() {
    normalVarargs(1,2,3,4)
    normalVarargs(4,5,6)
}

fun normalVarargs(vararg counts : Int) {
    for (num in counts) {
        print("$num ")
    }
    println()
}