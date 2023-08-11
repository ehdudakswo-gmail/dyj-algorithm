package baekjoon.p10874

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: List<List<Int>>): List<Int> {
    val list = listOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    return (0 until inputs.size).filter { inputs[it] == list }.map { it + 1 }
}