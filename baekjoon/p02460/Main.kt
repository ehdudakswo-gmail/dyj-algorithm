package baekjoon.p02460

fun main(args: Array<String>) {
    val inputs = Array(10) { IntArray(2) }

    for (i in 0 until inputs.size) {
        inputs[i] = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    }

    println(solve(inputs))
}

private fun solve(inputs: Array<IntArray>): Int {
    var cnt = 0
    var max = 0

    for (input in inputs) {
        cnt -= input[0]
        cnt += input[1]
        max = maxOf(max, cnt)
    }

    return max
}