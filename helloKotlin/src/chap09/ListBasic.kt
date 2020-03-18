package chap09

/**
 * listOf, mutableListOf
 * 각각 불변형, 가변형 list 생성 헬퍼 함수
 * 불변형은 생성, 초기화 후 읽기만 허용되며 가변형은 생성,초기화 후에도 변경이 가능하다.
 * 불변형으로 생성하는 것이 권장된다.
 */
fun main() {
    val numbers : List<Int>  = listOf(1,2,3,4,5)
    val mutableNumbers : MutableList<Int> = mutableListOf(1,2,3,4,5)
    val emptyList : List<String> = emptyList()
    val emptyList2 = emptyList<String>()
    val notNullList : List<Int> = listOfNotNull(2,45,2,null,5,null)
    val names : List<String> = listOf("one","two","three")
    val fruits = listOf("apple", "banana", "kiwi")

    for(name in names) {
        println(name)
    }
    numbers.forEach({print(it)})
    println()


    for(index in fruits.indices) { // index에 접근할 수 있음
        if(index % 2 == 0) println("fruits[$index] = ${fruits[index]}")
    }
    println(notNullList)

    mutableNumbers.add(0)
    println(mutableNumbers)

}