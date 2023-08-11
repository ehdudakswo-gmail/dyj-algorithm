package baekjoon.p10926

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): String {
    return buildString {
        append(input)
        append("??!")
    }
}