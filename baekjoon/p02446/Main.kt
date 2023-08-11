package baekjoon.p02446

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println(solve(n))
}

private fun solve(n: Int): String {
    return buildString {
        for (i in 1..n) {
            append(" ".repeat(i - 1))
            append("*".repeat(n * 2 - i * 2 + 1))
            appendln()
        }

        for (i in n - 1 downTo 1) {
            append(" ".repeat(i - 1))
            append("*".repeat(n * 2 - i * 2 + 1))
            appendln()
        }
    }
}