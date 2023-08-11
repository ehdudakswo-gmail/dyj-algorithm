package baekjoon.p05789

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!))
    }
}

private fun solve(input: String): String {
    val a = input.length / 2 - 1
    val b = a.inc()

    return when (input[a] == input[b]) {
        true -> "Do-it"
        false -> "Do-it-Not"
    }
}