package baekjoon.p10822

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): Int {
    return input.split(",").sumBy { it.toInt() }
}