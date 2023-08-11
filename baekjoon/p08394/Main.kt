package baekjoon.p08394

fun main() {
    println(solve(readLine()!!.toInt()))
}

private fun solve(n: Int): Int {
    val dp = IntArray(n + 1)
    dp[1] = 1
    dp[2] = 2

    for (i in 3..n) {
        dp[i] = (dp[i - 2] + dp[i - 1]) % 10
    }

    return dp[n]
}