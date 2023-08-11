package baekjoon.p03003

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs).joinToString(" "))
}

private fun solve(inputs: List<Int>): List<Int> {
    return arrayOf(1, 1, 2, 2, 2, 8).mapIndexed { i, v -> (v - inputs[i]) }
}