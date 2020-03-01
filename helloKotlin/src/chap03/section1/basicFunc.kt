package chap03.section1

fun mySum(a : Int, b : Int) : Int {
    return a + b
}
fun mySum2(a : Int, b : Int) : Int = a + b // 중괄호 안에 코드가 한줄이면 중괄호와 return 문 생략 가능
fun mySum3(a : Int, b : Int) = a + b // Int 형 인자 끼리 더하면, Int형이 나온다는 것을 예측할 수 있기 때문에 생략 가능

fun main() {
    val student : Student = Student()
    student.myAdd("lee yun bok")
    println(student.getStudentInform())

}
class Student {
    private var name : String? = null
    private var email : String? = null
    fun myAdd(name: String, email: String = "default") {
        this.name = name
        this.email = email
    }

    fun getStudentInform() : String {
        return name + "  " + email
    }
}
