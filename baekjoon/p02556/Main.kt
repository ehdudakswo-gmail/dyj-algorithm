package baekjoon.p02556

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(n: Int): String {
    return buildString {
        repeat(n) {
            append("*".repeat(n))
            append("\n")
        }
    }
}