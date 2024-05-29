package jp.ac.it_college.std.s23024.practice.chap2

class AddCalculationExecutorDelegate(private val calculationExecutor: CalculationExector) : CalculationExector by calculationExecutor {
    override fun calc(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}