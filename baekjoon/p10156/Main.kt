package baekjoon.p10156

fun main(args: Array<String>) {
    readLine()!!
            .split(" ")
            .map { it.toInt() }
            .let { println(solve(it[0], it[1], it[2])) }
}

private fun solve(k: Int, n: Int, m: Int): Int {
    return maxOf(k * n - m, 0)
}