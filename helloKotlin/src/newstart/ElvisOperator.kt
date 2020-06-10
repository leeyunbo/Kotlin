package newstart

fun main() {
    var str1 : String? = null

    str1 = getUserDataToRetrofit()

    str1?.throwViewModel(str1) ?: println("ERROR")

}


fun getUserDataToRetrofit() : String? {
    return "UserData"
}

fun String.throwViewModel(userData: String) {
    println(userData)
}