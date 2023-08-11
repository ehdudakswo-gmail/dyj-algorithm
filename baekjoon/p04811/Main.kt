package baekjoon.p04811

fun main() {
    while (true) {
        val input = readLine()!!.toInt()
        if (input == 0) {
            break
        }

        println(solve(input))
    }
}

private fun solve(n: Int): Long {
    return P04811(n).solve()
}

private class P04811(val n: Int) {

    var dp = List(n + 1) { LongArray(n + 1) }

    fun solve(): Long {
        return dfs(n, 0)
    }

    private fun dfs(w: Int, h: Int): Long {
        if (w == 0 && h == 0) {
            return 1
        }

        if (dp[w][h] > 0) {
            return dp[w][h]
        }

        if (w > 0) {
            dp[w][h] += dfs(w - 1, h + 1)
        }

        if (h > 0) {
            dp[w][h] += dfs(w, h - 1)
        }

        return dp[w][h]
    }

}