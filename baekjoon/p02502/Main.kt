package baekjoon.p02502

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs[0], inputs[1]).joinToString("\n"))
}

private fun solve(d: Int, k: Int): IntArray {
    for (a in 1..k) {
        for (b in a..k) {
            if (dp(a, b, d) == k) {
                return intArrayOf(a, b)
            }
        }
    }

    return intArrayOf()
}

private fun dp(a: Int, b: Int, d: Int): Int {
    val dp = IntArray(d + 1)
    dp[1] = a
    dp[2] = b

    for (i in 3..d) {
        dp[i] = dp[i - 2] + dp[i - 1]
    }

    return dp[d]
}