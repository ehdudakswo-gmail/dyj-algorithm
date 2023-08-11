package baekjoon.p01094

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(n: Int): Int {
    return (n.toString(2).count { it == '1' })
}