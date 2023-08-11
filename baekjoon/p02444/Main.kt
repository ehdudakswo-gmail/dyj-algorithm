package baekjoon.p02444

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println(solve(n))
}

private fun solve(n: Int): String {
    return buildString {
        for (i in 1..n) {
            append(" ".repeat(n - i))
            append("*".repeat(i * 2 - 1))
            append("\n")
        }

        for (i in n - 1 downTo 1) {
            append(" ".repeat(n - i))
            append("*".repeat(i * 2 - 1))
            append("\n")
        }
    }
}