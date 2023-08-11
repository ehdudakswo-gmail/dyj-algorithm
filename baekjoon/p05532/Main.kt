package baekjoon.p05532

import kotlin.math.ceil

fun main(args: Array<String>) {
    val inputs = Array(5) { readLine()!!.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: Array<Int>): Int {
    val l = inputs[0]
    val a = ceil(inputs[1].toDouble() / inputs[3]).toInt()
    val b = ceil(inputs[2].toDouble() / inputs[4]).toInt()

    return l - maxOf(a, b)
}