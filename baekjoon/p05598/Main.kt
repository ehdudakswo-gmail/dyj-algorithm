package baekjoon.p05598

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): String {
    return buildString {
        for (ch in input) {
            if ((ch - 3).isUpperCase()) {
                append(ch - 3)
            } else {
                append(ch + 23)
            }
        }
    }
}