package baekjoon.p01919

import kotlin.math.abs

fun main() {
    println(solve(readLine()!!, readLine()!!))
}

private fun solve(a: String, b: String): Int {
    val size = 26
    val cntA = IntArray(size)
    val cntB = IntArray(size)

    for (i in 0 until a.length) {
        val idx = a[i] - 'a'
        cntA[idx]++
    }

    for (i in 0 until b.length) {
        val idx = b[i] - 'a'
        cntB[idx]++
    }

    return (0 until size).sumBy { abs(cntA[it] - cntB[it]) }
}