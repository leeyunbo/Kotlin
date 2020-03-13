package chap07

import jdk.nashorn.internal.objects.Global.eval

/**
 * 실드 클래스 그 자체는 추상 클래스와 같기 때문에 객체를 만들 수 없다.
 * 생성자는 기본적으로 private이고, private가 아니면 오류가 남
 * 같은 파일 내에선 상속이 가능하지만 외부에서는 상속이 불가능하다.
 * 블록 안에 선언되는 클래스는 상속이 필요한 경우 open class로 선언한다.
 * 한마디로 실드 클래스는 클래스들을 묶어주는 역할을 하여, 다형성을 실현 시켜준다.
 */
sealed class Result {
    open class Success(val message : String) : Result()
    class Error(val code : Int, val message : String) : Result()
}

class Status : Result()
class Inside : Result.Success("Status")

fun main() {
    val result = Result.Success("Good!")
    val result2 = Status()
    val result3 = Result.Error(0,"Bad!")
    val msg = eval(result)
    val msg2 = eval(result2)
    val msg3 = eval(result3)
    println(msg)
    println(msg2)
    println(msg3)
}

fun eval(result : Result) : String = when(result) {
    is Status -> "in progress"
    is Result.Success -> result.message
    is Result.Error -> result.message
}