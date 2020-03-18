package chap09

import java.util.*
import kotlin.collections.HashSet

/**
 * HashSet은 해시 테이블에 요소를 저장할 수 있는 컬렉션이다.
 * 해시 테이블이란, 내부적으로 키와 인덱스를 이용해 검색과 변경을 빠르게 처리할 수 있는 자료구조이다.
 * HashSet은 일단, Set의 하위 클래스기 때문에 중복을 허용하지 않으며 필요한 값을 요청과 즉시 O(1) 안에 찾아낸다. 해시값을 이용하기 때문에!
 *
 * sortedSetOf()를 통하여 TreeSet 컬렉션을 생성할 수 있다. TreeSet은 레드-블랙 트리로 구현된 자료구조이며 HashSet과 마찬가지로 가변성 컬렉션 밖에
 * 존재하지 않는다. HashSet보다 추가,삭제시에는 시간이 걸리지만 검색과 정렬이 뛰어나다는 장점이 있다.
 *
 * linkedSetOf()를 통하여 LinkedHashSet 컬렉션을 생성할 수 있다. LinkedHastSet은 저장된 순서대로 데이터가 유지되며, HashSet,TreeSet보다는 느리지만
 * 포인터 연결을 통해 메모리 저장 공안을 좀 더 효율적으로 사용할 수 있다.
 */
fun main() {
    val intsHashSet : HashSet<Int> = hashSetOf(23,4,1,5,20)
    intsHashSet.add(5)
    intsHashSet.remove(23)

    println(intsHashSet)

    val intsSortedSet : TreeSet<Int> = sortedSetOf(4,1,7,2)
    intsSortedSet.add(6)
    intsSortedSet.remove(1)
    println(intsSortedSet)

    val intsLinkedHashSet : LinkedHashSet<Int> = linkedSetOf(34,21,75,26,21)
    intsLinkedHashSet.add(34)
    intsLinkedHashSet.remove(21)
    println(intsLinkedHashSet)
}
