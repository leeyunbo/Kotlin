package chap09

/**
 * Set은 중복을 허용하지 않는다.
 * mutableSetOf()를 통해, 가변성 Set을 생성할 수 있다.
 */
fun main() {
    val mixedTypeSet = setOf("Hello", 5, "World", 3.14, 'c')
    var intSet : Set<Int> = setOf<Int>(1,5,5)
    println(mixedTypeSet)
    println(intSet)

    val animals : MutableSet<String> = mutableSetOf("Lion", "Dog", "Cat", "Python", "Hippo")
    println(animals)

    animals.add("Dog")
    println(animals)

    animals.remove("Python")
    println(animals)
}