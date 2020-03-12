package chap06

/**
 * by : 위임, 즉 어떤 특정일을 대신 하라고 명령을 내리는 것
 * class CarModel(val model : String, impl : Car) : Car by impl => Car Interface에서 정의하고 있는 impl의 모든 멤버를 CarModel에게 위임한다.011111111111111111111111111111111111111
 */
interface Car {
    fun go() : String
}

class VanImpl(val power : String) : Car {
    override fun go() = "은 짐을 적재하며 $power 을 가집니다."
}

class SportImpl(val power : String) : Car {
    override fun go() = "은 경주용에 사용되며 $power 을 가집니다."
}

class CarModel(val model : String, impl : Car) : Car by impl {
    fun carInfo() {
        println("$model ${go()}")
    }
}

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100마력"))
    val my350z = CarModel("350Z 2008", SportImpl("350마력"))

    myDamas.carInfo()
    my350z.carInfo()
}