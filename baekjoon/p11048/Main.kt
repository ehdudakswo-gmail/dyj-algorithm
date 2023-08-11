package baekjoon.p11048

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = List(n) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(n, m, inputs))
}

private fun solve(n: Int, m: Int, inputs: List<List<Int>>): Int {
    val dp = List(n + 1) { IntArray(m + 1) }
    for (i in 1..n) {
        for (j in 1..m) {
            dp[i][j] = inputs[i - 1][j - 1] + max(dp[i - 1][j], dp[i - 1][j - 1], dp[i][j - 1])
        }
    }

    return dp[n][m]
}

private fun max(a: Int, b: Int, c: Int): Int {
    return listOf(a, b, c).max()!!
}