package chap05

/**
 * Engine 클래스는 Car 클래스의 생명주기에 의존적임.
 * Car 객체가 생성됨과 동시에 Engine 객체가 생성되며, 만약 Car 객체가 소멸되면 Engine 객체도 소멸됨
 */
class CCar(val name : String, val power : String) {
    private var engine = Engine(power)

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power : String) {
    fun start() = println("Engine has been started")
    fun stop() = println("Engine has been stopped")
}

fun main() {
    val car = CCar("porche", "250hp")
    car.startEngine()
    car.stopEngine()
}
