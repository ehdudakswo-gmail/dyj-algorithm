package baekjoon.p10807

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val v = readLine()!!.toInt()
    println(solve(inputs, v))
}

private fun solve(inputs: IntArray, v: Int): Int {
    return inputs.count { it == v }
}