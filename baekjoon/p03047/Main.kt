package baekjoon.p03047

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    val str = readLine()!!
    println(solve(inputs, str).joinToString(" "))
}

private fun solve(inputs: List<Int>, str: String): List<Int> {
    val sorted = inputs.sorted()
    return str.map { sorted[it - 'A'] }
}