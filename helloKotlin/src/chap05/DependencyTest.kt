package chap05

/**
 * 의존 관계 예제
 * 의사 객체가 생성되기 위해서는 환자 객체가 이미 생성된 이후 여야만 함
 * 따라서 생명주기에 관여하므로 이러한 관계를 의존 관계라고 함
 */
class DPatient(val name : String, var id : Int) {
    fun doctorList(d : DDoctor) {
        println("Patient : $name, Doctor : ${d.name}")
    }
}

class DDoctor(val name : String, val p : DPatient) {
    val customerId : Int = p.id

    fun patientList() {
        println("Doctor : $name, Patient : ${p.name}")
        println("Patient Id : $customerId")
    }
}

fun main() {
    val patient1 = DPatient("kildong", 1234)
    val doc1 = DDoctor("kimSabu", patient1)
    doc1.patientList()
}