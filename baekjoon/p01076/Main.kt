package baekjoon.p01076

import kotlin.math.pow

fun main(args: Array<String>) {
    val inputs = Array(3) { readLine()!! }
    println(solve(inputs))
}

private fun solve(inputs: Array<String>): Long {
    val set = arrayOf(
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "violet",
            "grey",
            "white"
    )

    val a = set.indexOf(inputs[0])
    val b = set.indexOf(inputs[1])
    val c = set.indexOf(inputs[2])

    return (a * 10 + b) * (10f.pow(c)).toLong()
}