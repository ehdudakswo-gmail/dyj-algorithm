package baekjoon.p01834

fun main(args: Array<String>) {
    println(solve(readLine()!!.toLong()))
}

private fun solve(n: Long): Long {
    return (1 until n).map { n * it + it }.sum()
}