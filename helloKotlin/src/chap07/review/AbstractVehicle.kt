package chap07.review

/**
 * 추상 클래스는 인터페이스와 다르게 구현된 일반 메서드나 프로퍼티를 가질 수 있음
 * 추상 클래스는 자식 클래스에게 abstract를 사용해 반드시 갖춰야 하는 프로퍼티와 메서드를 제시함
 * 또한 자식 클래스들이 공통적으로 가져야할 메서드와 프로퍼티를 구현해서 상속시킬 수도 있음
 */

abstract class Vehicle(val name: String, val color: String, val weight: Double) {
    abstract var maxSpeed: Double

    var year = "2018"

    abstract fun start()
    abstract fun stop()

    fun displaySpecs() {
        println("name : $name, color : $color, weight : $weight, maxSpeed : $maxSpeed")
    }
}

class SuperCar(_name: String, _color: String, _weight: Double, _maxSpeed: Double) : Vehicle(_name,_color,_weight) {
    override var maxSpeed: Double = _maxSpeed
    override fun start() {
        println("200km")
    }

    override fun stop() {
        println("20sec")
    }
}
fun main() {

}