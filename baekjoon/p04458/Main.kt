package baekjoon.p04458

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!))
    }
}

private fun solve(input: String): String {
    return input.replaceRange(0..0, input.first().toUpperCase().toString())
}