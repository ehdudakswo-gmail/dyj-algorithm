package baekjoon.p10818

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val ret = solve(inputs)
    println("${ret[0]} ${ret[1]}")
}

private fun solve(inputs: IntArray): IntArray {
    return intArrayOf(inputs.min()!!, inputs.max()!!)
}