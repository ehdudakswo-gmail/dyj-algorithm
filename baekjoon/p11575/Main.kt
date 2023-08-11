package baekjoon.p11575

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        val str = readLine()!!
        println(solve(a, b, str))
    }
}

private fun solve(a: Int, b: Int, str: String): String {
    return buildString {
        for (ch in str) {
            val x = ch - 'A'
            val n = (a * x + b) % 26
            val ret = (n + 'A'.toInt()).toChar()
            append(ret)
        }
    }
}