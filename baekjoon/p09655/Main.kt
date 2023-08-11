package baekjoon.p09655

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(input: Int): String {
    return when (input % 2 == 1) {
        true -> "SK"
        false -> "CY"
    }
}