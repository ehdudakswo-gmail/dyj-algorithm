package baekjoon.p02750

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = IntArray(n) { readLine()!!.toInt() }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: IntArray): IntArray {
    return inputs.sorted().toIntArray()
}