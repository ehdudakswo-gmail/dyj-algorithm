package baekjoon.p02869

import kotlin.math.ceil

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs[0], inputs[1], inputs[2]))
}

private fun solve(a: Int, b: Int, v: Int): Int {
    val target = v - a
    val div = a - b

    return ceil(target.toDouble() / div).toInt().inc()
}