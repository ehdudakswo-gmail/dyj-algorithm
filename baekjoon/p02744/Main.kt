package baekjoon.p02744

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): String {
    return buildString {
        for (ch in input) {
            if (ch.isLowerCase()) {
                append(ch.toUpperCase())
            } else {
                append(ch.toLowerCase())
            }
        }
    }
}