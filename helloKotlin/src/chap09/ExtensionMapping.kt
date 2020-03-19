package chap09

/**
 * list.map{람다식} : list에 있는 요소들 모두에게 람다식을 적용시킨 후, 결과로 나온 요소들로 이루어진 컬렉션을 반환해준다.
 * list.mapIndexed{람다식} : map 기능 + index도 인자로 사용 가능
 * list.mapNotNull{람다식} : Null을 제외하고 식을 적용하여 컬렉션 반환
 *
 * list.flatMap{람다식} : 각 요소에 식을 적용한 후 이것들을 다시 하나로 합쳐 새로운 컬렉션을 반환
 * list.groupBy{람다조건식} : 주어진 조건식에 따라 요소들을 그룹화 하고, 이것을 다시 Map으로 반환한다.
 */
fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listWithNull = listOf(1,null,3,null,5,6)

    println(list.map { it * 2 })
    val mapIndexed = list.mapIndexed{index, it -> index * it}
    println(mapIndexed)

    println(listWithNull.mapNotNull { it?.times(2) })

    println(list.flatMap{ listOf(it,'A') })
    val result = listOf("abc","12").flatMap{ it.toList() }
    println(result)

    val grpMap = list.groupBy { if (it % 2 == 0) "even" else "odd" } // return {odd=[1,3,5],even=[2,4,6} : Map<String,Int>
    println(grpMap)

}