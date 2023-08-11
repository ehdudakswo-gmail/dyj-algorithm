package baekjoon.p02443

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println(solve(n))
}

private fun solve(n: Int): String {
    return buildString {
        for (i in 1..n) {
            append(" ".repeat(i - 1))
            append("*".repeat(n * 2 - i * 2 + 1))
            append("\n")
        }
    }
}