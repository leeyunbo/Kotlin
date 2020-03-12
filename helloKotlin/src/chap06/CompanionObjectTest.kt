package chap06

/**
 * 컴패니언 객체는 실체 객체의 싱글턴이라고 할 수 있음!
 * 컴패니언 객체의 멤버들은 객체 생성없이도 접근할 수 있다!
 * 즉 JAVA의 Static 멤버임. JAVA에서 companion 객체에 접근하기 위해서는
 * CPerson.Companion.~ 이런식으로 접근해야함
 * 만약 Companion을 붙이기 싫다면 companion 멤버에 @JvmStatic 에너테이션을 붙여주면 됨
 * val 변수는 실행시간에 값이 할당되므로, const를 붙이면 컴파일 시간에 할당되도록 할 수 있음(자바에서 접근하기 위해서 필요)
 * @JvmField는 프로퍼티를 자바에서 사용하고자 할 경우에 붙여야한다.
 */
class CPerson {
    var id : Int = 0
    var name : String = "yunbok"
    companion object {
        const val LEVEL = "INTERMEDIATE3"
        @JvmField var language : String = "Korean"
        @JvmField var JOB = KJob()
        @JvmStatic
        fun work() {
            println("Working..")
        }
    }
    class KJob {
        constructor() {
            println("개발자")
        }
    }
}

fun main() {
    println(CPerson.language)
    CPerson.language = "English,Korean"
    println(CPerson.language)
    CPerson.work()
}