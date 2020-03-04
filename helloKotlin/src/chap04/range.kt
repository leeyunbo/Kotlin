package chap04

fun main() {
    print("Enter the Score : ")
    val score = readLine()!!.toDouble()
    var grade : Char = 'F'

    if(score >= 90.0) {
        grade = 'A'
    } else if(score in 80.0..90.0) {
        grade = 'B'
    } else if(score in 70.0..80.0) {
        grade = 'C'
    }

    when (score) {
        is Double -> println("올바른 점수 입니다.")
        90.0 -> grade = 'A'
        in 80.0..90.0 -> grade = 'B'
        in 70.0..80.0 -> grade = 'C'
        else -> {
            grade = 'D'
        }
    }

    when {
        score >= 90.0 -> grade = 'A'
        score in 80.0..90.0 -> grade = 'B'
        score in 70.0..80.0 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }

    println(grade)
}

fun cases (obj : Any) { //Any -> Java에서의 Object 클래스라고 보면됨
    when(obj) {
        is Long -> println("Long")
        is String -> println("String")
        else -> println("NO")
    }
}