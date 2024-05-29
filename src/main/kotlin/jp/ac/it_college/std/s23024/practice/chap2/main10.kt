package jp.ac.it_college.std.s23024.practice.chap2

fun main() {
    println("----2.10.2----")
    val list = listOf(1, 2, 3, 4)
    list.forEach { num -> println(num) }
    println("----2.10.3----")
    list.forEach { println(it) }

    println("----2.10.4----")
    run {
       val idList = list.map { it * 10 }
        idList.forEach { println(it) }
    }

    println("----2.10.5----")
    run {
        val users = listOf(
            User2(1,100,"Takenhata"),
            User2(2, 100, "Kotlin")
        )
        val idList = users.map { it.id }
        idList.forEach {println(it) }
    }

    println("----2.10.6----")
    run {
        val users = listOf(
            User2(1,100,"Takenhata"),
            User2(2, 200, "Kotlin"),
            User2(3, 100, "Java")
        )
        val filteredList = users.filter { it.teamid == 100 }
        filteredList.forEach {
            println(it)
        }
    }

    println("----2.10.7----")
    run {
        val users = listOf(
            User2(1,100,"Takenhata"),
            User2(2, 200, "Kotlin"),
            User2(3, 100, "Java"),
            User2(4, 200, "Groovy")
        )
        println(users.first())
        println(users.last())
    }

    println("----2.10.8----")
    run {
        val users = listOf(
            User2(1,100,"Takenhata"),
            User2(2, 200, "Kotlin"),
            User2(3, 100, "Java"),
            User2(4, 200, "Groovy")
        )
        println(users.first { it.teamid == 200 })
        println(users.last { it.teamid == 100 })
    }

    println("----2.10.9----")
    run {
        val users = listOf(
            User2(1,100,"Takenhata"),
            User2(2, 200, "Kotlin"),
            User2(3, 100, "Java"),
            User2(4, 200, "Groovy")
        )
        println(users.firstOrNull() { it.teamid == 200 })
        println(users.lastOrNull() { it.teamid == 100 })
        println(users.firstOrNull() { it.teamid == 1000 })
        println(users.lastOrNull() { it.teamid == 1000 })
    }

    println("----2.10.10----")
    run {
        val list = listOf(1, 1, 2, 3, 4, 5)
        val distinctList = list.distinct()
        distinctList.forEach(::println)
    }

    println("----2.10.11----")
    run {
        val users = listOf(
            User2(1,100,"Takenhata"),
            User2(2, 200, "Kotlin"),
            User2(3, 100, "Java")
        )
        val userMap = users.associateBy(User2::id)
        println(userMap)
    }

    println("----2.10.11+1----")
    run {
        val students = listOf(
            Student("s30001", "Kuriyama"),
            Student("s30002", "Oohira"),
            Student("s30003", "Tokunaga"),
            Student("s30004", "Kawase"),
            Student("s30005", "Kameda")
        )
        students.forEach(::println)
        //  学籍番号をキーとしてMap型に変換
        val studentMap = students.associateBy(Student::id)
        studentMap.forEach(::println)
    }

    println("----2.10.12----")
    run {
        val list = listOf("Takehata", "Kotlin", "Java")
        val map = list.associateWith(String::length)
        println(map)
        map.forEach(::println)
    }

    println("----2.10.13--")
    run {
        val list = listOf(
            User2(1,100,"Takenhata"),
            User2(2, 200, "Kotlin"),
            User2(3, 100, "Java"),
            User2(4, 200, "Groovy"),
        )
        val map = list.groupBy(User2::teamid)
        println(map)
        println(map[100])
        println(map[200])
    }

    println("----2.10.14--")
    run {
        val list = listOf(1, 2, 3, 4, 5)
        val addNumberCount = list.count { it % 2 == 1 }
        println(addNumberCount)
    }

    println("----2.10.15--")
    run {
        val list = listOf(
            "Takenhata",
            "Koltin",
            "Java",
            "groovy",
            "Scala"
        )
        val chunkedList = list.chunked(2)
        println(chunkedList)
        chunkedList.forEach(::println)
    }

    println("----2.10.16--")
    run {
        val list = listOf(1, 2, 3, 4, 5)
        val result = list.reduce { sum, value ->
            println("$sum + $value")
            sum + value
        }
        println(result)
    }

    println("----2.10.17--")
    run {
        val list = listOf(1, 2, 3, 4, 5)
        val result = list.reduce { sum, value -> sum * value }
        println(result)
    }
}