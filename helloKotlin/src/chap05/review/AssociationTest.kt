package chap05.review

/**
 *             생명 주기에 영향을 주는가?   참조 관계 인가?    포함 관계 인가?
 *   연관 관계            X                    O                X
 *   의존 관계            O                    O                X                      (Doctor가 생성되기 전에, Patient가 먼저 생성되어야 있어야 하므로 생명주기에 영향을 줌)
 *   집합 관계            X                    O                O
 *   구성 관계            O                    O                O
 */

class Patient(val name: String) {
    fun doctorList(d: AssociationDoctor) {
        println("Patient: $name, Doctor: ${d.name}")
    }
    fun doctorList(d: DependencyDoctor) {
        println("Patient: $name, Doctor : ${d.name}")
    }
}

class AssociationDoctor(val name: String) {
    fun patientList(p: Patient) {
        println("Doctor : $name, Patient: ${p.name}")
    }
}

class DependencyDoctor(val name: String, val patient: Patient) {
    fun patientList() {
        println("Doctor: $name, Patient: ${patient.name}")
    }
}

class CompositionCar(val name: String, val power: String) {
    private var engine = Engine(power) // Car가 사라지면 engine도 파괴, Car가 생성과 동시에 engine도 생성 ==> 각 생명주기에 의존적

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power: String) {
    fun start() = println("Start")
    fun stop() = println("Stop")
}

fun main() {
    val doc1 = AssociationDoctor("KimSabu")
    val patient1 = Patient("Kildong")
    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}