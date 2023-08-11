package baekjoon.p11024

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        println(solve(inputs))
    }
}

private fun solve(inputs: List<Int>): Int {
    return inputs.sum()
}