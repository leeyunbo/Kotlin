package chap09

/**
 * list.elementAt(인덱스) : 해당 인덱스 값을 반환
 * list.elementAtOrElse{인덱스,람다식} : 만약 인덱스를 벗어나게 되면, 인덱스를 람다식에 적용한 결과값을 리턴한다.
 * list.elementAtOrNull(인덱스) : 만약 인덱스를 벗어나면 null 리턴
 *
 * list.first { 람다 조건식 } : 람다 조건식에 해당되는 요소중 첫번째 요소를 반환
 * list.last { 람다 조건식 } : 람다 조건식에 해당되는 요소중 마지막 요소를 반환
 * list.indexOf(요소) : 요소에 일치하는 인덱스 반환
 * list.indexOfFirst{람다 조건식} : 첫번째로 일치하는 요소 인덱스 반환
 * list.lastIndexOf(요소) : 요소에 일치하는 가장 마지막 인덱스 반환
 * list.indexOfLast{람다 조건식} : 마지막으로 일치하는 요소 인덱스 반환
 * list.single{람다 조건식} : 조건식에 해당되는 요소 하나 반환
 * list.binarySearch(요소) : 해당 요소의 인덱스 반환, 얘는 중복된 요소가 있을 경우 확실히 보장되지 않음
 * list.find{조건식} : 조건식에 해당되는 첫번째 요소 반환
 */
fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listPair = listOf(Pair("A",300), Pair("B",200), Pair("C",100), Pair("D",200))
    val listRepeated = listOf(2,2,3,4,5,5,6)

    println(list.elementAt(1))
    println(list.elementAtOrElse(10, {2 * it}))
    println(list.elementAtOrNull(10))

    println(listPair.first { it.second == 200 })
    println(listPair.last { it.second == 200})
    println(listPair.firstOrNull { it.first == "E" })
    println(listPair.lastOrNull { it.first == "E" })
}