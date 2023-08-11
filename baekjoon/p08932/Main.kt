package baekjoon.p08932

import kotlin.math.pow

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        println(solve(inputs))
    }
}

private fun solve(inputs: List<Int>): Int {
    val check = arrayOf("t", "f", "f", "t", "f", "f", "t")
    val set = arrayOf(
            doubleArrayOf(9.23076, 26.7, 1.835),
            doubleArrayOf(1.84523, 75.0, 1.348),
            doubleArrayOf(56.0211, 1.5, 1.05),
            doubleArrayOf(4.99087, 42.5, 1.81),
            doubleArrayOf(0.188807, 210.0, 1.41),
            doubleArrayOf(15.9803, 3.8, 1.04),
            doubleArrayOf(0.11193, 254.0, 1.88)
    )

    return (0 until inputs.size).sumBy {
        if (check[it] == "t") {
            (set[it][0] * (set[it][1] - inputs[it]).pow(set[it][2])).toInt()
        } else {
            (set[it][0] * (inputs[it] - set[it][1]).pow(set[it][2])).toInt()
        }
    }
}