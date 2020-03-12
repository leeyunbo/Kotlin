package chap07

/**
 * 추상 메서드에 대한 예제
 * 여기서 abstract가 붙은 멤버들은 하위 클래스에서 꼭 구현을 해줘야한다.
 * 추상클래스는 open 키워드를 사용할 필요가 없다.
 * 하위 클래스가 꼭 갖춰야할 메서드와 프로퍼티를 abstract 키워드를 이용해 제시한다.
 *
 */
abstract class Vehicle(val name : String, val color : String, val weight : Double) {
    abstract var maxSpeed : Double
    var year = "2018"
    abstract fun start()
    abstract fun stop()

    fun displaySpecs() {
        println("Specs......")
    }
}

class Car(name : String, color : String, weight : Double, override var maxSpeed : Double) : Vehicle(name,color,weight) {
    override fun start() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("car Start")
    }

    override fun stop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("car Stop")
    }
}