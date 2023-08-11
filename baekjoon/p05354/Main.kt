package baekjoon.p05354

fun main(args: Array<String>) {
    repeat(readLine()!!.trim().toInt()) {
        println(solve(readLine()!!.trim().toInt()))
    }
}

private fun solve(n: Int): String {
    if (n <= 1) {
        return "#\n"
    }

    return buildString {
        val a = "#".repeat(n)
        val b = "#" + "J".repeat(n - 2) + "#"
        repeat(n) {
            when (it) {
                0, n - 1 -> append(a).appendln()
                else -> append(b).appendln()
            }
        }
    }
}