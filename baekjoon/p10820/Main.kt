package baekjoon.p10820

fun main(args: Array<String>) {
    while (true) {
        val input = readLine() ?: return
        println(solve(input).joinToString(" "))
    }
}

private fun solve(input: String): IntArray {
    return intArrayOf(
            input.count { it.isLowerCase() },
            input.count { it.isUpperCase() },
            input.count { it.isDigit() },
            input.count { it.isWhitespace() }
    )
}