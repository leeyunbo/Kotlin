package chap03.section1.basic

fun mySum(a : Int, b : Int) : Int {
    return a + b
}
fun mySum2(a : Int, b : Int) : Int = a + b // 중괄호 안에 코드가 한줄이면 중괄호와 return 문 생략 가능
fun mySum3(a : Int, b : Int) = a + b // Int 형 인자 끼리 더하면, Int형이 나온다는 것을 예측할 수 있기 때문에 생략 가능

fun main() {
    val student : Student = Student()
    student.myAdd("lee yun bok")
    println(student.getStudentName() +" : final test AVG = "+ student.getAvgFinalTest(math = 95, english = 35, science = 60))
    student.setStudentHaveItem("축구공","야구공","수학책","Do it!, 코틀린 프로그래밍","노트북")
    println(student.getStudentHaveItem())

}
class Student {
    private var name : String? = null
    private var email : String? = null
    private var item_list : ArrayList<String> = ArrayList()
    fun myAdd(name: String, email: String = "default") {
        this.name = name
        this.email = email
    }

    fun getStudentName() : String? {
        return name
    }

    fun getStudentEmail() : String? {
        return email
    }

    fun getAvgFinalTest(math : Int, english : Int, science : Int) : Int = (math + english + science) / 3

    fun setStudentHaveItem(vararg items : String) {
        for(item in items) {
            item_list.add(item)
        }
    }

    fun getStudentHaveItem() : String = item_list.toString()
}
