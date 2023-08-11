package baekjoon.P10996

fun main() {
    val n = readLine()!!.toInt()
    println(solve(n))
}

private fun solve(n: Int): String {
    return buildString {
        repeat(n) {
            append(pattern(n, "*", " "))
            appendln()
            append(pattern(n, " ", "*"))
            appendln()
        }
    }
}

private fun pattern(n: Int, a: String, b: String): String {
    return buildString {
        for (i in 0 until n) {
            if (i % 2 == 0) {
                append(a)
            } else {
                append(b)
            }
        }
    }
}