package baekjoon.p02789

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): String {
    return input.filter { it !in "CAMBRIDGE" }
}