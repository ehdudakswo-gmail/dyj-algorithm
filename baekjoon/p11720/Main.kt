package baekjoon.p11720

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt(), readLine()!!))
}

private fun solve(n: Int, input: String): Int {
    return input.map { it.toString().toInt() }.sum()
}