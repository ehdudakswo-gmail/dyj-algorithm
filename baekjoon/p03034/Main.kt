package baekjoon.p03034

import kotlin.math.sqrt

fun main(args: Array<String>) {
    val (n, w, h) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = Array(n) { readLine()!!.toInt() }
    println(solve(w, h, inputs).joinToString("\n"))
}

private fun solve(w: Int, h: Int, inputs: Array<Int>): List<String> {
    val max = sqrt((w * w + h * h).toFloat())
    return inputs.map {
        when (it <= max) {
            true -> "DA"
            false -> "NE"
        }
    }
}