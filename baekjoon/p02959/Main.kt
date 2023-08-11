package baekjoon.p02959

fun main() {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: List<Int>): Int {
    val sorted = inputs.sorted()
    return (sorted[0] * sorted[2])
}