package chap03.section1

fun sum(a : Int, b : Int) = a + b
fun max(a : Int, b : Int) = if(a>b) a else b  //함수의 각 정보는 프레임이라는 정보로 스택메모리의 높은 주소부터 거꾸로 자라듯이 채워져감
                                              // 각 프레임 안에는 변수들의 메모리 공간이 존재
fun not_Return() : Unit { println("None") } //반환 값이 없을 때, 반환 값의 자료형은 Unit, 생략 가능
fun add_Inform(name : String, email : String = "default") { //파이썬처럼 ㅇㅋ?
    println(name)
    println(email)
}
fun defaultXYZ(x : Int = 100, y : Int = 200, z : Int = 400) { println(x + y + z) }
fun variableArgs(vararg counts : Int) { //가변인자 사용, counts는 Int형 배열이 됨
    var sum : Int = 0
    for (arg in counts) {
        print("${arg} ")
        sum += arg
    }
    println()
    println("sum : ${sum}")
}

fun main() {
    val result1 = sum(3,2)
    val result2 = sum(6,7) //함수의 재사용!
    val max_result1 = max(3,2)


    println(result1)               //    힙은 반대로 낮은주소에서 높은주소로 접근, 따라서 스택과 힙이 서로 침범할 수도 있음 --> 스택 오버플로우(재귀 함수 잘못만들면 발생함)
    println(result2)               //    sum()... max()... Frame  ---- 낮은주소.... // 메인 함수에서 함수가 호출되는 순간 새로운 프레임 생성, 완료 후 제거
    println(max_result1)           //    main() Frame   ---- 높은주소              스택!
                                  // 다른 함수안에 있는 변수끼리는 이름이 같아도 상관 없음, 왜냐 다른 프레임에 존재하기 때문에
                                  // 함수는 들어온 순 반대로 소멸, 스택은 원래 후입선출인거 알죠?
    add_Inform("이윤복")
    add_Inform("이윤복","servers1@naver.com")

    defaultXYZ()
    defaultXYZ(x = 200, z = 800) // 파이썬과 다르게 이렇게 정해서 값을 지정해줄 수 있다.

    variableArgs(1,2,3,4,5,6,7,8,9)
}