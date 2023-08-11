package baekjoon.p10991

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println(solve(n))
}

private fun solve(n: Int): String {
    return buildString {
        for (i in 1..n) {
            append(" ".repeat(n - i))
            append("* ".repeat(i).trimEnd())
            appendln()
        }
    }
}