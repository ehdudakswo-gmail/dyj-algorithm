package baekjoon.p10870

fun main(args: Array<String>) {
//    println(solve(readLine()!!.toInt()))
    println(solve2(readLine()!!.toInt()))
}

private fun solve(n: Int): Int {
    if (n <= 1) {
        return n
    }

    return solve(n - 2) + solve(n - 1)
}

private fun solve2(n: Int): Int {
    if (n <= 1) {
        return n
    }

    val dp = IntArray(n + 1)
    dp[0] = 0
    dp[1] = 1

    for (i in 2..n) {
        dp[i] = dp[i - 2] + dp[i - 1]
    }

    return dp[n]
}