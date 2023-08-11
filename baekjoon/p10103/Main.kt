package baekjoon.p10103

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = Array(n) { IntArray(2) }

    for (input in inputs) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        input[0] = a
        input[1] = b
    }

    for (ret in solve(inputs)) {
        println(ret)
    }
}

private fun solve(inputs: Array<IntArray>): IntArray {
    val ret = IntArray(2) { 100 }

    for (input in inputs) {
        if (input[0] < input[1]) {
            ret[0] -= input[1]
        } else if (input[0] > input[1]) {
            ret[1] -= input[0]
        }
    }

    return ret
}