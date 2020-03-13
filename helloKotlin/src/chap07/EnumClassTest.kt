package chap07

/**
 * 실드 클래스와 유사하지만 열거형 클래스는 같은 타입 데이터들 밖에 못 다룬다.
 */
interface Score {
    fun getScore() : Int
}

enum class MemberType(var prio : String) : Score {
    NORMAL("Third") {
        override fun getScore(): Int = 100
    },
    SILVER("Second") {
        override fun getScore(): Int = 500
    },
    GOLD("First") {
        override fun getScore(): Int = 1500
    }
}

fun main() {
    println(MemberType.NORMAL.getScore())
    println(MemberType.GOLD)
    println(MemberType.valueOf("SILVER"))
    println(MemberType.SILVER.prio)

    for(grade in MemberType.values()) {
        println("grade.name = ${grade.name}, prio = ${grade.prio}")
    }
}