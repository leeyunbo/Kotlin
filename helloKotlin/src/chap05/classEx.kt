package chap05

class Bird {
    var name : String
    var wing : Int
    var beak : String
    var color : String

    constructor(name : String, wing : Int, beak : String, color : String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    constructor(name : String, wing : Int) {
        this.name = name
        this.wing = wing
        beak = "Unknown"
        color = "Unknown"
    }

    fun fly() = println("wing count : $wing")
    fun sing(vol : Int) = println("Sing vol : $vol")
}

class Human constructor(_age : Int, _name : String) {
    var age = _age
    var name = _name
    init {
        println(age)
        println(name)
    }
}

fun main() {
    val bird = Bird("fireBird",3,"long","red")
    bird.fly()
    bird.sing(3)
    val Unknownbird = Bird("thunderBird",4)
    Unknownbird.fly()
    Unknownbird.sing(100)
    val human = Human(13,"lee yun bok")

}