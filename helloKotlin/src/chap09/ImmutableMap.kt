package chap09

/**
 * mapOf를 이용하여 key와 Value를 저장하는 자료구조인 Map 컬렉션을 생성할 수 있다.
 * Key는 중복이 안되지만 Value는 중복이 가능하다.
 * 가변형 Map은 mutableMapOf()로 생성이 가능하다.
 * MutableMap은 List, Set과 다르게 MutableCollections에서 상속받은 것이 아닌, Map에서 상속되어 확장되었다.
 */
fun main() {
    val ImageMap : Map<Int, String> = mapOf(44 to "Java", 55 to "Kotlin", 66 to "C++")
    for((key,value) in ImageMap) {
        println("($key, $value)")
    }

    println(ImageMap[44])
    println(ImageMap[55])
    println(ImageMap[66])

    val MutableImageMap : MutableMap<Int,String> = mutableMapOf(11 to "Java")
    MutableImageMap.put(22, "Kotlin")
    MutableImageMap.put(33, "C++")
    MutableImageMap.remove(22)
    for((key,value) in MutableImageMap) {
        println("($key, $value}")
    }

    MutableImageMap.putAll(ImageMap)
    println(MutableImageMap)
}