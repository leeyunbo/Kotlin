package chap07

data class Customer(var name : String, var email : String)  {
    var job : String = "Unknown"
    constructor(name : String, email : String, _job : String) : this(name,email) {
        job = _job
    }
    init {
        println("초기화 완료")
    }
}


fun main() {
    val cus1 = Customer("lee yun bok", "servers1@naver.com","Developer")
    val (name,email) = cus1
}