package chap08

/**
 * in, out, * 프로젝션에 대한 예제
 */

class InOutTest<in T, out U>(t : T, u : U) {
    // val propT : T = t in 이기 때문에 에러
    val propU : U = u

    // fun func1(u : U) out 이기 때문에 에러
    fun func2(t : T) {
        print(t)
    }
}

fun starTestFunc(v : InOutTest<*,*>) {
    //v.func2(1)
    print(v.propU)
}