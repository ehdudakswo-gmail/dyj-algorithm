package baekjoon.p10867

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs).joinToString(" "))
}

private fun solve(inputs: List<Int>): List<Int> {
    return inputs.toSet().sorted()
}