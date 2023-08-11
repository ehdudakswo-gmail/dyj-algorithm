package baekjoon.p10707

fun main(args: Array<String>) {
    val inputs = List(5) { readLine()!!.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: List<Int>): Int {
    val x = inputs[0] * inputs[4]
    val y = (inputs[1] + inputs[3] * maxOf(0, inputs[4] - inputs[2]))

    return minOf(x, y)
}