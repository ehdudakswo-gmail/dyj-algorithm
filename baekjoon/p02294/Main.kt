package baekjoon.p02294

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = IntArray(n) { readLine()!!.toInt() }
    println(solve(inputs, k))
}

private fun solve(inputs: IntArray, k: Int): Int {
    val INF = 987654321
    val dp = IntArray(k + 1) { INF }
    dp[0] = 0

    for (input in inputs) {
        for (i in 1..k) {
            if (i >= input) {
                dp[i] = minOf(dp[i], dp[i - input] + 1)
            }
        }
    }

    return when (dp[k]) {
        INF -> -1
        else -> dp[k]
    }
}