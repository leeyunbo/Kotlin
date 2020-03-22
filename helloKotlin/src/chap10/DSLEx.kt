package chap10

data class DslPerson (
    var name : String? = null,
    var age : Int? = null,
    var job : DslJob? =  null
)

data class DslJob (
    var category : String? = null,
    var position : String? = null,
    var extension : Int? = null
)

fun personFirst(block : (DslPerson) -> Unit) : DslPerson {
    val p = DslPerson()
    block(p)
    return p
}

fun person(block : DslPerson.() -> Unit ) : DslPerson = DslPerson().apply(block)
fun DslPerson.job(block : DslJob.() -> Unit) {
    job = DslJob().apply(block)
}

fun main() {
    val person = person {
        name = "Kildong"
        age = 40
        job {
            category = "IT"
            position = "Android Developer"
            extension = 1234
        }
    }
}




