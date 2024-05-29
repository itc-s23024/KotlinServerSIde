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

    println("----2.7.6----")
    val addNumbers6 = mutableListOf<Int>().let { list ->
        for (i in 1 .. 10) {
            if (i % 2 == 1) {
                list.add(i)
            }
        }
        list.joinToString(separator = " ")
    }
    println(addNumbers6)

    println("----2.7.7--2.7.8----")
    println(createUser("Takehata"))
    println(createUser(null))

    println("----2.7.11----")
    val addNumbers11 = mutableListOf<Int>().apply {
        for (i in 1 .. 10) {
            if (i % 2 == 1) {
                add(i)
            }
        }
        joinToString(separator = " ")
    }
    println(addNumbers11)

    println("----2.7.12--2.7.13----")
    updateUser(100, "Kotlin", "Nagoya")
}

fun randomGenerateNumber(): Int? {
    return if (Random.nextBoolean()) Random.nextInt(1 .. 10) else null
}