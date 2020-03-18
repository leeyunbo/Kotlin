package chap09

/**
 * arraylist는 list와 다르게 가변형 list이다. 추가와 삭제가 가능하다.
 * 가변형 mutableList를 리턴 받기 위해서는 mutableListOf를 사용해야 한다.
 * arrayListOf는 가변형 list지만, ArrayList 형태이다.
 * 불변형 List를 toMutableList()을 이용해서 MutableList로 변환시킬 수 있음
 */
fun main() {
    val stringList : ArrayList<String> = arrayListOf("Hello","Kotlin","Wow")
    stringList.add("java")
    stringList.remove("java")
    println(stringList)

    val notMutableList : List<String> = listOf("Halo","Kotlin","Wo")
    val MutableList : MutableList<String> = notMutableList.toMutableList()
    MutableList.add("Good")
    println(MutableList)



}