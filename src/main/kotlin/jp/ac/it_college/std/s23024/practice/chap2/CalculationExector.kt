package jp.ac.it_college.std.s23024.practice.chap2

interface CalculationExector {
    val message: String
    fun calc(num1: Int, num2: Int): Int
    fun printStartMessage()
}