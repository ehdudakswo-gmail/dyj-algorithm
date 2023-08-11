package baekjoon.p05596

fun main(args: Array<String>) {
    val inputs = Array(2) { readLine()!!.split(" ").map { it.toInt() }.toIntArray() }
    println(solve(inputs))
}

private fun solve(inputs: Array<IntArray>): Int {
    return maxOf(inputs[0].sum(), inputs[1].sum())
}