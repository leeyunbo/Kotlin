package chap08

/**
 * 넘 ㅜ어렵다..
 */

class InOutTest<in T, out U>(t : T, u : U) {
    val propT : T = t
    val propU : U = u

    fun func1(u : U)
    fun func2(t : T) {
        print(t)
    }
}

fun starTestFunc(v : InOutTest<*,*>) {
    v.func1(1)
    print(v.propU)
}