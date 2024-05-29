package jp.ac.it_college.std.s23024.practice.chap3

import java.time.LocalDateTime
import java.util.*

fun main() {
    val uuid: UUID = UUID.randomUUID()
    println(uuid)

    val now = LocalDateTime.now()
    println(now)
}