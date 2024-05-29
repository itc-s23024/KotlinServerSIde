package jp.ac.it_college.std.s23024.practice.chap2

fun main() {
    val exector = AddCalculationExexutor(CommonCalculationExecutor())
    exector.printStartMessage()
    println(exector.calc(8, 11))

    val executorDelegate = AddCalculationExecutorDelegate(exector)
    executorDelegate.printStartMessage()
    println(executorDelegate.calc(8, 11))

    val person = Person()
    person.name = "Takehata"
    person.address = "Tokyo"
    println(person.name)
    println(person.address)
}