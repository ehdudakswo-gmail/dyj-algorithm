package baekjoon.p01453

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: List<Int>): Int {
    return inputs.size - inputs.distinct().size
}