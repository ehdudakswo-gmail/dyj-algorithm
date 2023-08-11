package baekjoon.p09656

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(input: Int): String {
    return when (input % 2 == 0) {
        true -> "SK"
        false -> "CY"
    }
}