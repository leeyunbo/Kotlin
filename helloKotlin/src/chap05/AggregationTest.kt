package chap05

/**
 * Pond 객체가 Duck 객체를 소유하고 있으므로 집합 관계라고 할 수 있음
 */
class Pond(val name : String, val members : MutableList<Duck>)
{
    constructor(_name : String) : this(_name, mutableListOf<Duck>())
}

class Duck(val name : String) {
    fun main() {
        val pond = Pond("myFavorite")
        val duck1 = Duck("Duck1")
        val duck2 = Duck("Duck2")

        pond.members.add(duck1)
        pond.members.add(duck2)

        for(duck in pond.members) {
            println(duck.name)
        }
    }
}
