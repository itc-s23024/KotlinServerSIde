package jp.ac.it_college.std.s23024.practice.chap2

class AddCalculationExexutor(private val calculationExector: CalculationExector) :CalculationExector {

    override val message: String
        get() = calculationExector.message

    override fun calc(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    override fun printStartMessage() {
        calculationExector.printStartMessage()
    }
}