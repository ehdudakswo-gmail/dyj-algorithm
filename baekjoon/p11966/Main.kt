package baekjoon.p11966

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(input: Int): Int {
    return when (input.toString(2).count { it == '1' }) {
        1 -> 1
        else -> 0
    }
}