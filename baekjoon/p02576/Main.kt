package baekjoon.p02576

fun main(args: Array<String>) {
    val inputs = IntArray(7)
    for (i in 0 until inputs.size) {
        inputs[i] = readLine()!!.toInt()
    }

    for (ret in solve(inputs)) {
        println(ret)
    }
}

private fun solve(inputs: IntArray): IntArray {
    val odds = inputs.filter { it % 2 == 1 }

    if (odds.isEmpty()) {
        return intArrayOf(-1)
    }

    val sum = odds.sum()
    val min = odds.min()!!.toInt()

    return intArrayOf(sum, min)
}