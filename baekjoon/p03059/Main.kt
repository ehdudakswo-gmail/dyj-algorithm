package baekjoon.p03059

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!))
    }
}

private fun solve(input: String): Int {
    return (('A'..'Z') - input.toSet()).sumBy { it.toInt() }
}