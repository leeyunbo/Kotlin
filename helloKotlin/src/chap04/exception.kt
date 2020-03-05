package chap04

import org.omg.CORBA.DynAnyPackage.Invalid
import java.lang.Exception

fun main() {
    var checkAmout : () -> Unit
    checkAmout = {
        for(i in 1..5) {
            println(i)
            if(i > 3) throw Exception("i가 3을 초과하였습니다.")
        }
    }

    try {
        checkAmout()
    } catch (e:Exception) {
        println(e.message)
    }

    var name ="kildong123"
    try {
        validateName(name)
    } catch(e : InvalidNameException) {
        println(e.message)
    }  catch(e : Exception) {
        println(e.message)
    }
}

fun validateName(name : String) {
    if(name.matches(Regex(".*\\d+.*"))) { //숫자가 포함되어 있는가?
        throw InvalidNameException("Your name : $name : contains numberals")
    }
}

class InvalidNameException(message : String) : Exception(message)

