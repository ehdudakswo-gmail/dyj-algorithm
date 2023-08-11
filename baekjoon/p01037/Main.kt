package baekjoon.p01037

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    println(solve(inputs))
}

private fun solve(inputs: IntArray): Int {
    inputs.sort()
    return (inputs.first() * inputs.last())
}