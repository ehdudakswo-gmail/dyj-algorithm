package baekjoon.p01932

fun main() {
    val n = readLine()!!.toInt()
    val arr = List(n + 1) { IntArray(n + 1) }

    for (i in 1..n) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        for (j in 1..inputs.size) {
            arr[i][j] = inputs[j - 1]
        }
    }

    println(solve(n, arr))
}

private fun solve(n: Int, arr: List<IntArray>): Int {
    val dp = Array(n + 1) { IntArray(n + 1) }
    dp[1][1] = arr[1][1]

    for (i in 2..n) {
        for (j in 1..i) {
            dp[i][j] = arr[i][j] + maxOf(dp[i - 1][j - 1], dp[i - 1][j])
        }
    }

    return dp[n].max()!!
}