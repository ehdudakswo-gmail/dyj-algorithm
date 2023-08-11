package baekjoon.p11399

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: List<Int>): Int {
    val sorted = inputs.sorted()
    val dp = IntArray(sorted.size)
    dp[0] = sorted[0]

    for (i in 1 until dp.size) {
        dp[i] = dp[i - 1] + sorted[i]
    }

    return dp.sum()
}