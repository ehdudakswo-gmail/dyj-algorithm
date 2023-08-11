package baekjoon.p10821

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): Int {
    return input.split(",").size
}