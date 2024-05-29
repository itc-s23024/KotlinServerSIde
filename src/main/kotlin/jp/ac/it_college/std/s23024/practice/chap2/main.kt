package jp.ac.it_college.std.s23024.practice.chap2

typealias Calc = (Int, Int) -> Int

fun main() {
    val user = User3()
    user.name = "ほげ"
    println(user.name)
//    user.name = null    //コンパイルエラー

    println("----2.28--2.29----")
    val user4 = User4()
    user4.name = ""
    println("isValidName: ${user4.isValidname}")
    user4.name = "タカシ"
    println("isValidName: ${user4.isValidname}")

    println("----2.5.10--2.5.11----")
    printCalcResult(3, 4) {x, y -> x * y}
}

val User4.isValidname: Boolean
    get() = name != ""

fun printCalcResult(num1: Int, num2: Int, calc: Calc) {
    val result = calc(num1, num2)
    println("計算結果: $result")
}