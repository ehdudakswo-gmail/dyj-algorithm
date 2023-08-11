package baekjoon.p01871

import kotlin.math.absoluteValue
import kotlin.math.pow

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!))
    }
}

private fun solve(input: String): String {
    val inputs = input.split("-")
    val a = inputs[0].mapIndexed { i, c ->
        val n = c - 'A'
        val radix = (26f).pow(inputs[0].length - i - 1)
        (n * radix)
    }.sum()
    val b = inputs[1].toInt()

    return when ((a - b).absoluteValue <= 100) {
        true -> "nice"
        false -> "not nice"
    }
}