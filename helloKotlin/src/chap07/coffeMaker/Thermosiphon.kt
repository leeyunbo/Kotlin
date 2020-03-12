package chap07.coffeMaker

class Thermosiphon(heater : Heater) : Pump, Heater by heater {
    override fun pump() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        if(isHot()) {
            println("[Thermosiphon] pumping...")
        }
    }
}