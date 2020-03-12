package chap07.coffeMaker

class CoffeeMaker (val coffeeModule: CoffeeModule) {
    fun brew() {
        val theSiphon : Thermosiphon = coffeeModule.getThermosiphon()
        theSiphon.on()
        theSiphon.pump()
        println("Coffee, here!")
        theSiphon.off()
    }
}