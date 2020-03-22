package chap10

/**
 * DSL 예제,
 * 특정 어플리케이션의 도메인을 위해 특화된 언어. 람다 함수와 확장 함수를 적절히 활용하면 DSL 형태의 언어를 만들 수 있음
 * 대표적으로 Anko 프레임워크가 있다.
 *
 * (DslPerson) -> Unit => DslPerson 객체를 인자로 받는 람다 함수기 때문에, it으로 접근
 * DslPerson.() -> Unit => 람다 함수를 호출한 것이 DslPerson 객체이기 때문에, this로 접근이 가능해진다.
 * 거기에 apply()를 사용했기 때문에, this를 생략이 가능하다.
 */
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
    val personFirst = personFirst {
        it.name = "Kildong"
        it.age = 24
        it.job {
            category = "IT"
            position = "Android Developer"
            extension = 1234
        }
    }
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




