package baekjoon.p02293

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = IntArray(n) { readLine()!!.toInt() }
    println(solve(inputs, k))
}

private fun solve(inputs: IntArray, k: Int): Int {
    val dp = IntArray(k + 1)
    dp[0] = 1

    for (input in inputs) {
        for (i in 1..k) {
            if (i >= input) {
                dp[i] += dp[i - input]
            }
        }
    }

    return dp[k]
}