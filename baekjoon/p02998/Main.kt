package baekjoon.p02998

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): String {
    return input.toBigInteger(2).toString(8)
}