package chap07

/**
 *
 */
interface A {
    fun functionA() {

    }
}

interface B {
    fun functionB() {

    }
}

class DelegateC(a : A, b : B) : A by a, B by b {
    fun functionC() {
        functionA()
        functionB()
    }
}