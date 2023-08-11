package baekjoon.p11382

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toLong() }
    println(solve(inputs))
}

private fun solve(inputs: List<Long>): Long {
    return inputs.sum()
}