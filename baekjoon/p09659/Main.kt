package baekjoon.p09659

fun main(args: Array<String>) {
    println(solve(readLine()!!.toLong()))
}

private fun solve(input: Long): String {
    return when (input % 2 == 1L) {
        true -> "SK"
        false -> "CY"
    }
}