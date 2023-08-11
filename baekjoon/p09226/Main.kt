package baekjoon.p09226

fun main(args: Array<String>) {
    while (true) {
        val input = readLine()!!
        if (input == "#") break
        println(solve(input))
    }
}

private fun solve(input: String): String {
    var idx = input.indexOfFirst { it in "aeiou" }
    if (idx == -1) {
        idx = 0
    }

    return buildString {
        append(input.substring(idx))
        append(input.substring(0, idx))
        append("ay")
    }
}