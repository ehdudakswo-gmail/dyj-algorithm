package baekjoon.p10102

fun main(args: Array<String>) {
    val v = readLine()!!.toInt()
    val input = readLine().toString()
    println(solve(v, input))
}

private fun solve(v: Int, input: String): String {
    var cnt = 0

    for (ch in input) {
        when (ch) {
            'A' -> cnt++
            'B' -> cnt--
        }
    }

    return when {
        cnt > 0 -> "A"
        cnt < 0 -> "B"
        else -> "Tie"
    }
}