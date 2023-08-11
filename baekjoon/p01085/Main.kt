package baekjoon.p01085

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: List<Int>): Int {
    return arrayOf(
            inputs[0],
            inputs[2] - inputs[0],
            inputs[1],
            inputs[3] - inputs[1]
    ).min()!!
}