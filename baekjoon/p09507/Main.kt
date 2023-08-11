package baekjoon.p09507

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!.toInt()))
    }
}

private fun solve(n: Int): Long {
    val dp = LongArray(68)
    dp[0] = 1
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4

    for (i in 4 until dp.size) {
        dp[i] = dp[i - 4] + dp[i - 3] + dp[i - 2] + dp[i - 1]
    }

    return dp[n]
}