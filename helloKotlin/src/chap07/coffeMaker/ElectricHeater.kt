package chap07.coffeMaker

class ElectricHeater(var heating : Boolean = false) : Heater {
    override fun on() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("[Electricheater] heating..")
        heating = true
    }

    override fun off() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        heating = false
    }
    override fun isHot(): Boolean = heating
}