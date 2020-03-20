package chap09

/**
 * 시퀀스는 순차적인 컬렉션으로 요소의 크기를 특정하지 않고, 나중에 결정할 수 있는 특수한 컬렉션
 * 예를 들어 해당 파일의 끝을 모르면 줄이 언제 끝날지 알 수 없는 경우가 있는데 이럴 때 사용
 * 처리 중에는 계산하고 있지 않다가 toList(), count() 같은 최종 연산에 의해 결정
 *
 * sequence를 사용하지않고, 그냥 메서드 체이닝을 이용해 컬렉션에 대해 다양한 연산을 수행하면 중간 중간 임시 컬렉션을 생성하여
 * 연산을 수행하다 보니 비효율적인 상황이 있을 수도 있음 이떄, sequence를 사용하게 되면 임시 컬렉션을 생성하지 않고도 연산을 수행할 수 있다.
 * 중간 연산에서는 다른 시퀀스를 반환하고, 최종 연산은 결과를 반환한다.
 * sequence의 중간 연산은 항상 지연 계산되며, 결과를 얻을 필요가 있을 때(최종 연산이 호출되는 경우) 적용된다.
 * 즉 각 원소에 대해 수행해서 시퀀스를 얻고, 그 시퀀스에 대해 다음 연산을 수행한다.
 */
fun main() {
    val nums : Sequence<Int> = generateSequence(1) { it + 1 }
    println(nums.take(10).toList())

    val nums2 : Sequence<Int> = generateSequence(2) {it + 2}
    println(nums2.take(10).toList())

    val squares = generateSequence(1) {it+1}.map {it * it}
    println(squares.take(10).toList())

    val oddSquares = squares.filter { it % 2 != 0 }
    println(oddSquares.take(5).toList())

    val newSquares = generateSequence(1) {it+1}
        .map {it * it}
        .filter { it % 2 != 0 }
        .take(10)
        .toList()
        .forEach{print("$it,")}

}