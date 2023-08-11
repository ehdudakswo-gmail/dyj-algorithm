package baekjoon.p05026

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!))
    }
}

private fun solve(input: String): String {
    return when (input.contains("+")) {
        true -> input.split("+").sumBy { it.toInt() }.toString()
        false -> "skipped"
    }
}