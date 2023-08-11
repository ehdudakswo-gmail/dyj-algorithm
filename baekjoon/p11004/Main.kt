package baekjoon.p11004

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = IntArray(n)

    val st = StringTokenizer(BufferedReader(InputStreamReader(System.`in`)).readLine()!!)
    for (i in 0 until n) {
        inputs[i] = st.nextToken().toInt()
    }

    println(solve(inputs, k))
}

private fun solve(inputs: IntArray, k: Int): Int {
    inputs.sort()
    return inputs[k - 1]
}