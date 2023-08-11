package baekjoon.p11655

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): String {
    return buildString {
        for (ch in input) {
            when {
                ch.isLowerCase() -> {
                    val idx = (ch - 'a' + 13) % 26
                    append('a' + idx)
                }
                ch.isUpperCase() -> {
                    val idx = (ch - 'A' + 13) % 26
                    append('A' + idx)
                }
                else -> {
                    append(ch)
                }
            }
        }
    }
}