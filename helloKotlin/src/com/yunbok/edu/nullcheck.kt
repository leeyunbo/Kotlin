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


    var x : Any // Any형은 모든 클래스들의 부모 클래스, 즉 슈퍼 클래스임
    x = "Hello" // 아직 Any형
    if(x is String) { //is로 타입 검사하는 순간, 해당 타입으로 자동 형변환(Any -> String) ㄴ
        println(x.length)
    }

    println("----------------------------------------")
    var asVar : String? = "Hello"
    var y : Int = 5

    asVar = asVar + (y as? String)

    println(asVar)

    println("----------------------------------------")

    checkArg("Hello")
    checkArg(5)

    println("----------------------------------------")

    var changeNum : Int = 25
    var changeNum2 : Int = 7

    changeNum = changeNum xor changeNum2  // xor 연산 세번하면, 스왑가능
    changeNum2 = changeNum xor changeNum2
    changeNum = changeNum xor changeNum2

    println("${changeNum}  ${changeNum2}")
}

fun checkArg(x : Any) {
    if(x is String) {
        println("x is String : $x")
    }

    if(x is Int) {
        println("x is Int : $x")
    }
}