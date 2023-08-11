package baekjoon.p02721

fun main() {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!.toInt()))
    }
}

private fun solve(n: Int): Int {
    return (1..n).sumBy { it * T(it + 1) }
}

private fun T(n: Int): Int {
    return (n * (n + 1)) / 2
}