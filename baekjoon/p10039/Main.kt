package baekjoon.p10039

import kotlin.math.max

fun main(args: Array<String>) {
    val input = ArrayList<Int>()
    val n = 5

    repeat(n) {
        input.add(readLine()!!.toInt())
    }

    println(solve(input))
}

private fun solve(input: ArrayList<Int>): Int {
    return input
            .toIntArray()
            .map { it -> max(it, 40) }
            .average()
            .toInt()
}