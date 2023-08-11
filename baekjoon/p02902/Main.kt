package baekjoon.p02902

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): String {
    return buildString {
        for (str in input.split("-")) {
            append(str.first())
        }
    }
}