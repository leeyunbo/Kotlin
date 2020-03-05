package chap05

open class plane(var name : String) {
    fun fly() = println("fly")
    fun land() = println("land")
}

class JetFigther(name : String, var misiile : String) : plane(name) {
    fun shot() = println("$misiile shot")
}

class DropShip : plane {
    var people : Int

    constructor(name : String, people : Int) : super(name) {
        this.people = people
    }

    fun drop() = println("$people drop")
}

fun main() {
    var jetFigther : JetFigther = JetFigther("F-14","fire-dog")
    jetFigther.fly()
    jetFigther.shot()
    jetFigther.land()
}