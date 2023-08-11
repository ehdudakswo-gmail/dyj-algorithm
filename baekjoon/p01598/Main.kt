package baekjoon.p01598

import kotlin.math.abs

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println(solve(a, b))
}

private fun solve(a: Int, b: Int): Int {
    val ai = (a - 1)
    val ax = ai / 4
    val ay = ai % 4

    val bi = (b - 1)
    val bx = bi / 4
    val by = bi % 4

    val x = abs(ax - bx)
    val y = abs(ay - by)

    return (x + y)
}