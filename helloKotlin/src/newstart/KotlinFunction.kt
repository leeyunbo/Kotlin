package newstart


fun add(name: String, email: String = "default") {
    println("${name} 님이 가입하셨습니다. 이메일 : ${email}")
}

fun friendsList(name: String, vararg friendsList: String) {
    println("------------------------------${name} FriendsList----------------------------------")
    for (name in friendsList) {
        println(name)
    }
    println("---------------------------------------------------------------------------")
}


fun main() {
    add("leeyunbok")
    add("sena","sena@naver.com")
    add(name = "sena", email = "sena@naver.com")
    friendsList("leeyunbok","sena","lena","fena","zena","tena")
}