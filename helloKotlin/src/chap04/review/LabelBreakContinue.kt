package chap04.review

/**
 * 라벨을 이용한 자신이 원하는 반복문을 Continue 하거나
 * 자신이 원하는 반복문을 break할 수 있음
 */
fun main() {
    labelContinue()
}

private fun labelContinue() {
    println("Label Continue")
    first@ for(i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) continue@first
            println("i: $i, j : $j")
        }
        println("after for j")
    }
    println("after for i")
}