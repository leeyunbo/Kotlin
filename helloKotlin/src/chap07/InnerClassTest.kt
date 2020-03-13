package chap07

/**
 * inner 클래스는 중첩 클래스와 다르게 외부,내부 양방향으로 접근이 가능하다.
 * 심지어 private 멤버에도 접근이 가능하다.
 * powerOn() 메서드 내부에 선언된 지역 클래스에서 외부 클래스의 프로퍼티에 접근이 가능하다. 하지만 powerOn에서 벗어나면 더 이상 사용 불가능
 */

interface Switcher {
    fun on() : String
}
class Smartphone(val model : String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size : Int) {
        fun getInfo() = "${model} : Installed on $cpu with ${size}Gb"
    }

    fun powerOn() : String {
        class Led(val color : String) {
            fun blink() : String = "Blinking $color on $model"
        }
        val powerStatus = Led("Red")
        val powerSwitch = object : Switcher { //익명 클래스. 1회성 객체가 생성되며, 이 메서드가 호출 될 때마다 1회성 객체가 생성된다.
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        return powerSwitch.on()
    }
}

fun main() {
    val mySdCard = Smartphone("S7").ExternalStorage(32)
    println(mySdCard.getInfo())
}
