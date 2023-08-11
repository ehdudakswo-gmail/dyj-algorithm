package baekjoon.p02965

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: List<Int>): Int {
    return (1 until inputs.size).map { inputs[it] - inputs[it - 1] }.max()!! - 1
}