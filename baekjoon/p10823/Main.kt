package baekjoon.p10823

fun main(args: Array<String>) {
    val inputs = generateSequence { readLine() }.toList()
    println(solve(inputs))
}

private fun solve(inputs: List<String>): Int {
    return inputs.joinToString("").split(",").sumBy { it.toInt() }
}