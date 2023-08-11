package baekjoon.p10992

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(n: Int): String {
    return buildString {
        for (i in 1..n) {
            append(line(i, n))
            appendln()
        }
    }
}

private fun line(i: Int, n: Int): String {
    return buildString {
        when (i) {
            1 -> {
                append(" ".repeat(n - i))
                append("*")
            }
            n -> {
                append("*".repeat(n * 2 - 1))
            }
            else -> {
                append(" ".repeat(n - i))
                append("*")
                append(" ".repeat((i - 1) * 2 - 1))
                append("*")
            }
        }
    }
}