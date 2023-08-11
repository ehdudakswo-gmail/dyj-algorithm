package baekjoon.p10984

import kotlin.math.roundToInt

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        val inputs = ArrayList<P10984Kt>()

        repeat(n) {
            val input = readLine()!!.split(" ")
            val c = input[0].toInt()
            val g = input[1].toDouble()
            inputs.add(P10984Kt(c, g))
        }

        val ret = solve(inputs)
        println("${ret.c} ${ret.g}")
    }
}

private fun solve(inputs: ArrayList<P10984Kt>): P10984Kt {
    var sum = 0
    var sum2 = 0.0

    for (input in inputs) {
        sum += input.c
        sum2 += (input.c * input.g)
    }

    val avg = (sum2 / sum)
    val roundAvg = (avg * 10).roundToInt().toDouble() / 10

    return P10984Kt(sum, roundAvg)
}

private class P10984Kt(val c: Int, val g: Double)