package baekjoon.p10995

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println(solve(n))
}

private fun solve(n: Int): String {
    return buildString {
        for (i in 0 until n) {
            if (i % 2 == 1) {
                append(" ")
            }

            append("* ".repeat(n))
            delete(length - 1, length)
            appendln()
        }
    }
}