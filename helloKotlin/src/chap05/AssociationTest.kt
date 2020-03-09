package chap05

/**
 * 연관 관계 예제
 * 서로 독립적인 생명주기를 가지고 있지만 객체가 양방향 참조를 가지고 있음
 * 서로 참조관계를 가지고 있지만 생명주기에 영향을 끼치지 않으므로 연관 관계
 */
class Patient(val name : String) {
    fun doctorList(d : Doctor) {
        println("Patient : $name , Doctor : ${d.name}")
    }
}

class Doctor(val name : String) {
    fun patientList(p : Patient) {
        println("Doctor : $name, Patient : ${p.name}")
    }
}

fun main() {
    val doc1 = Doctor("KimSabu")
    val patient1 = Patient("kildong")
    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}