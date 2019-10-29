package com.yunbok.edu



fun main() {
    var str1 : String? = "Hello Kotlin"
    str1 = null

    val len = if(str1 != null) { print(str1.length) } else -1

    val len2 = str1?.length ?: -1 // 엘비스 연산자, null이면 오른쪽, 아니면 왼쪽 식을 수행행

   println("${str1} : ${len}")

    println("----------------------------------------")


    val a : Int = 128
    val b : Int? = 128

    println(a==b)
    println(a===b) //주소 비교, Int 형과 Int?형은 값이 같아도 같은 곳에 저장X, Int?형은 참조형, Int형은 기본형으로 바뀌어서 컴파일됨

    println("----------------------------------------")

    val num : Number = 12.4
    val num2  : Number = 12   // 스마트캐스트, Number 형으로 선언한 변수는 자동으로 형변환이 가능

    println("num is Double : ${num is Double}")
    println("num2 !is Int : ${num2 !is Int}")

    println("----------------------------------------")


    val x : Any
    x = "Hello" // 아직 Any형
    if(x is String) { //is로 타입 검사하는 순간, 해당 타입으로 자동 형변환(Any -> String) ㄴ
        println(x.length)
    }


}