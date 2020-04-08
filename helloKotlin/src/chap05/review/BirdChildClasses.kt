package chap05.review

/**
 * open 키워드를 사용해야 파생 클래스들이 상속받을 수 있음
 * 메서드 앞에 open을 붙이면 오버라이딩이 가능함
 */
private open class Birds(var name: String, var wing: Int, var beak: String, var color: String) {
    open fun fly() = println("Fly")
}

private class Lark : Birds {
    val language: String

    constructor(name: String,
                wing: Int,
                beak: String,
                color: String,
                language: String) : super(name,wing,beak,color) {
        this.language = language
    }

    fun speak() = println("Speak! $language")
}

private class Parrot(var language: String, name: String, wing: Int, beak: String, color: String) : Birds(name,wing,beak,color) {
    fun speak() = println("Speak! $language")
}

