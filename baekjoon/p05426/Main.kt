package baekjoon.p05426

import kotlin.math.sqrt

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!))
    }
}

private fun solve(input: String): String {
    val len = sqrt(input.length.toDouble()).toInt()
    val a = Array(len) { CharArray(len) }
    val b = Array(len) { CharArray(len) }

    var si = 0
    var ai = 0
    while (si < input.length) {
        a[ai] = input.substring(si, si + len).toCharArray()
        si += len
        ai++
    }

    for (i in 0 until len) {
        b[i] = (0 until len).map { a[it][len - i - 1] }.toCharArray()
    }

    return buildString {
        for (e in b) {
            append(e)
        }
    }
}