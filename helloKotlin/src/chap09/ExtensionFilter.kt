package chap09

/**
 * 컬렉션의 필터 관련 메서드 예제
 *
 * list.filter{람다 조건식} : 조건식에 해당되는 요소를 리턴
 * list.filterNot{람다 조건식} : 조건식에 해당되지 않은 요소들을 리턴
 * list.filterNotNull() : Null을 제외한 요소들을 리턴
 *
 * list.filterIndexed{idx, value를 인자로 받는 람다 조건식} : filter와 똑같지만, 2개의 인자(idx, value)를 받는 람다를 사용할 수 있음
 * list.filterIndexedTo(반환 받고 싶은 컬렉션, idx,value를 인자로 받는 람다 조건식) : filterIndexed와 똑같지만, 해당되는 컬렉션을 반환한다.
 *
 * map.filterKeys{람다 조건식} : Key에 대한 조건식을 이용하여 해당되는 요소를 리턴
 * map.filterValues{람다 조건식} : Value에 대한 조건식을 이용하여 해당되는 요소를 리턴
 * list.filterIsInstance<원하는자료형>() : 원하는 자료형만 골라내서 반환
 *
 * list.slice(List Collection) : List Collection 안에 반환 받고 싶은 요소의 인덱스를 넣으면, 해당 값들을 잘라서 반환
 * list.take(갯수) : 앞에서부터 시작해서 갯수 만큼 요소 반환
 * list.takeLast(갯수) : 마지막부터 시작해서 갯수 만큼 요소 반환
 * list.takeWhile{람다 조건식} : 조건식에 맞는 요소들 반환
 *
 * list.drop(갯수) : 앞에서부터 갯수만큼 제외하고 반환
 * list.dropWhile{람다 조건식} : 조건식에 맞는 요소들을 제외하고 반환
 *
 * list.componentN() : N 번째 요소 반환. 얘는 인덱스로 하는게 아니라, list[0] => 첫번째 요소..
 *
 * list.distinct() : 중복된 요소를 하나로 합치고 반환
 * list.intersect(List Collection) : 인자의 list와 중복된 요소 반환(교집합)
 */
fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listMixed = listOf(1,"Hello",3,"World",5,'A')
    val listWithNull = listOf(1,null,3,null,5,6)
    val listRepeated = listOf(2,2,3,4,5,5,6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    println(list.filter { it % 2 == 0 })
    println(list.filterNot { it % 2 == 0 })
    println(listWithNull.filterNotNull())

    println(list.filterIndexed{ idx,value -> idx != 1 && value % 2 == 0 })
    val mutList = list.filterIndexedTo(mutableListOf(),{ idx,value -> idx != 1 && value % 2 == 0})
    println(mutList)

    println(map.filterKeys{it != 11})
    println(map.filterValues{it == "Java"})

    println(listMixed.filterIsInstance<Int>())

    println(list.slice(listOf(0,1,2)))
    println(list.take(2))
    println(list.takeLast(2))
    println(list.takeWhile{it < 3})

    println(list.drop(3))
    println(list.dropWhile{it < 3})
    println(list.dropLastWhile{ it > 3 })

    println(listRepeated.distinct())
    println(list.intersect(listOf(5,6,7,8)))

}
