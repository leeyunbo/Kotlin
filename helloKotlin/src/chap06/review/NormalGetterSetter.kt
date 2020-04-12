package chap06.review

/**
 * field : 클래스의 프로퍼티를 참조하는 변수
 * value : 세터의 매개변수로 외부로터 값을 가져옴
 * 만약 프로퍼티에 직접 접근하면 각각, setValue, getValue로 자동변환되어 무한 호출됨
 * 따라서 StackOverFlow가 발생
 * set에 private 사용 가능, 그럼 변수 데이터를 바꿔줄 수 없음
 * 근데.. 그럴꺼면 그냥 val로 하면 되자나?
 */

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value - 3
            }
        }


}


fun main() {
    val user1 = User(1, "kildong", 30)
    user1.age = 35
    println("user1.age = ${user1.age}")
}