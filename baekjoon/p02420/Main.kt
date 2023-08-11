package baekjoon.p02420

import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toLong() }
    println(solve(inputs[0], inputs[1]))
}

private fun solve(n: Long, m: Long): Long {
    return (n - m).absoluteValue
}