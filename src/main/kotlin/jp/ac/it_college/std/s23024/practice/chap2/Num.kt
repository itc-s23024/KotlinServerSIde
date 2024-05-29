package jp.ac.it_college.std.s23024.practice.chap2

data class Num(val value: Int) {
    operator fun plus(num: Num): Num {
        return Num(this.value + num.value)
    }
}
