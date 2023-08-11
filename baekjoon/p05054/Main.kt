package baekjoon.p05054

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        val inputs = readLine()!!.split(" ").map { input -> input.toInt() }.toIntArray()
        println(solve(inputs))
    }
}

private fun solve(inputs: IntArray): Int {
    inputs.sort()
    return (inputs.last() - inputs.first()) * 2
}