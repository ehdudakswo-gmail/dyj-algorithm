package baekjoon.p05176

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val (p, m) = readLine()!!.split(" ").map { it.toInt() }
        val inputs = IntArray(p) { readLine()!!.toInt() }
        println(solve(inputs))
    }
}

private fun solve(inputs: IntArray): Int {
    return (inputs.size - inputs.distinct().size)
}