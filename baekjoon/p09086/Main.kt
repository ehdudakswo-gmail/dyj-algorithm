package baekjoon.p09086

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!))
    }
}

private fun solve(input: String): String {
    return "${input.first()}${input.last()}"
}