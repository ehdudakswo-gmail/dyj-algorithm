package baekjoon.p10987

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): Int {
    return input.count { it in "aeiou" }
}