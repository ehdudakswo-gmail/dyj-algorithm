package baekjoon.p02562

fun main(args: Array<String>) {
    val inputs = IntArray(9)

    for (i in 0 until inputs.size) {
        inputs[i] = readLine()!!.toInt()
    }

    for (ret in solve(inputs)) {
        println(ret)
    }
}

private fun solve(inputs: IntArray): IntArray {
    val max = inputs.max()!!.toInt()
    val idx = inputs.indexOf(max)

    return intArrayOf(max, idx + 1)
}