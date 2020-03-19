package chap09

/**
 * list.union(합치고싶은 리스트) : Set을 리턴하며, 당연히 중복된 요소는 하나로 합쳐진다.
 * list.plus(합치고 싶은 리스트) : List 컬렉션을 반환하며, 중복을 허용한다.
 *
 * list.partion{람다 조건식} : 조건식에 맞는놈,안맞는놈을 각각 리스트로  분리해준다.
 * list.zip(List 컬렉션) : 인덱스가 같은 것끼리 묶어줌,이때 가장 요소가 작은 것을 기준으로 그 갯수만큼만 묶어준다.
 */
fun main() {
    val list1 = listOf(1,2,3,4,5,6)
    val list2 = listOf(2,2,3,4,5,5,6,7)

    println(list1.union(list2))
    println(list1.plus(list2))

    val part = list1.partition { it % 2 == 0 }
    println(part)

    val zip = list1.zip(listOf(7,8))
    println(zip)
}