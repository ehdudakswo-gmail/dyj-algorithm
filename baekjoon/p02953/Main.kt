package baekjoon.p02953

fun main(args: Array<String>) {
    val inputs = Array(5) { IntArray(4) }

    for (i in 0 until inputs.size) {
        inputs[i] = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    }

    val solve = solve(inputs)
    println("${solve[0]} ${solve[1]}")
}

private fun solve(inputs: Array<IntArray>): IntArray {
    val sums = IntArray(inputs.size)

    for (i in 0 until sums.size) {
        sums[i] = inputs[i].sum()
    }

    val maxSum = sums.max()!!.toInt()
    val maxIdx = sums.indexOf(maxSum)

    return intArrayOf(maxIdx + 1, maxSum)
}