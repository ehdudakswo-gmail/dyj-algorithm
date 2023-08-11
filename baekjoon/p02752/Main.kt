package baekjoon.p02752

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    println(solve(inputs).joinToString(" "))
}

private fun solve(inputs: IntArray): IntArray {
    return inputs.sortedArray()
}