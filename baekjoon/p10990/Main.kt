package baekjoon.p10990

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(n: Int): String {
    return buildString {
        for (i in 0 until n) {
            append(" ".repeat(n - i - 1))
            append("*")
            if (i > 0) {
                append(" ".repeat(i * 2 - 1))
                append("*")
            }
            append("\n")
        }
    }
}