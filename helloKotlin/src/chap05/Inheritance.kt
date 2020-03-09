package chap05

open class plane(var name : String) {
    open fun fly() = println("fly")
    final fun land() = println("land")
}

class JetFigther(name : String, var misiile : String) : plane(name) {
    fun shot() = println("$misiile shot")
    override fun fly() = println("fly $name")
}

class DropShip : plane {
    var people : Int

    constructor(name : String) : this(name, 10) {}

    constructor(name : String, people : Int) : super(name) {
        this.people = people
    }

    fun drop() = println("$people drop")
    override fun fly() = println("fly $name")
}

fun main() {
    var jetFigther : JetFigther = JetFigther("F-14","fire-dog")
    var medicDropShip : DropShip = DropShip("medicDropShip")
    var dropship : DropShip = DropShip("DropShip", 10)
    jetFigther.fly()
    jetFigther.shot()
    jetFigther.land()
    dropship.fly()
    dropship.drop()
    dropship.land()
    medicDropShip.fly()
    medicDropShip.drop()
    medicDropShip.land()
}