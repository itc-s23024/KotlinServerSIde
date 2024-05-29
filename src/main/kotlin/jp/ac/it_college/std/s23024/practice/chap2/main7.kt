package jp.ac.it_college.std.s23024.practice.chap2

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    println("----2.7.1----")
    val list = mutableListOf<Int>()
    for (i in 1 .. 10) {
        if (i % 2 == 1) {
            list.add(i)
        }
    }
    val addNumbers = list.joinToString(" ")
    println(addNumbers)

    println("----2.7.2--2.7.3----")
    val addNumbers2 = with(mutableListOf<Int>()) {
        for (i in 1 .. 10) {
            if (i % 2 == 1) {
                this.add(i)
            }
        }
        this.joinToString(" ")
    }
    println(addNumbers2)

    println("----2.7.4----")
    val addNumbers3 = mutableListOf<Int>().run {
        for (i in 1 .. 10) {
            if (i % 2 == 1) {
                add(i)
            }
        }
        joinToString(" ")
    }
    println(addNumbers3)

    println("----2.7.おまけ１----")
    randomGenerateNumber()?.run {
        println("１回目: ${this}が生成されました。")
        println("${this}の3倍は${this * 3}です。")
    }
    randomGenerateNumber()?.run {
        println("２回目: ${this}が生成されました。")
        println("${this}の3倍は${this * 3}です。")
    }
    randomGenerateNumber()?.run {
        println("３回目: ${this}が生成されました。")
        println("${this}の3倍は${this * 3}です。")
    }
    randomGenerateNumber()?.run {
        println("４回目: ${this}が生成されました。")
        println("${this}の3倍は${this * 3}です。")
    }
}

fun randomGenerateNumber(): Int? {
    return if (Random.nextBoolean()) Random.nextInt(1 .. 10) else null
}