package baekjoon.p11104

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!))
    }
}

private fun solve(input: String): Int {
    return input.toInt(2)
}