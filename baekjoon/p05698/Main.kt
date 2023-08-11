package baekjoon.p05698

fun main(args: Array<String>) {
    while (true) {
        val input = readLine()!!
        if (input == "*") break
        println(solve(input))
    }
}

private fun solve(input: String): String {
    return when (input.toLowerCase().split(" ").map { it[0] }.toSet().size) {
        1 -> "Y"
        else -> "N"
    }
}