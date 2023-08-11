package baekjoon.p09093

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!))
    }
}

private fun solve(input: String): String {
    return input.split(" ").map { it.reversed() }.joinToString(" ")
}