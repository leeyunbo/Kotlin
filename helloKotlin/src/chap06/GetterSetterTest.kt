package chap06

class User(_id : Int, _name : String, _age : Int, _first_name : String) {
    val id : Int = _id
    var name : String = _name
        set(value) {
            println("The name was changed")
            field = value.toUpperCase()
            first_name = first_name.toUpperCase()
        }
        get() = name
    var age : Int = _age
    private var first_name : String = _first_name
}

fun main() {
    val user = User(1, "Sean", 30,"lee")
    user.name = "lee yun bok"

}