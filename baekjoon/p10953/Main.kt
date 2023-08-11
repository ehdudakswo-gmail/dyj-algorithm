package baekjoon.p10953

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(",").map { it.toInt() }.toIntArray()
        println(solve(inputs))
    }
}

private fun solve(inputs: IntArray): Int {
    return inputs.sum()
}