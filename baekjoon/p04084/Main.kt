package baekjoon.p04084

import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    while (true) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        if (inputs.all { it == 0 }) break
        println(solve(inputs))
    }
}

private fun solve(inputs: List<Int>): Int {
    var ret = 0
    var arr = inputs
    val size = arr.size

    while (!arr.all { it == arr[0] }) {
        arr = (0 until size).map { (arr[it] - arr[(it + 1) % size]).absoluteValue }
        ret++
    }

    return ret
}