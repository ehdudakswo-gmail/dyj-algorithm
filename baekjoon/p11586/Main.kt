package baekjoon.p11586

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = Array(n) { readLine()!! }
    val k = readLine()!!.toInt()
    println(solve(inputs, k).joinToString("\n"))
}

private fun solve(inputs: Array<String>, k: Int): Array<String> {
    return when (k) {
        1 -> inputs
        2 -> inputs.map { it.reversed() }.toTypedArray()
        3 -> inputs.reversedArray()
        else -> arrayOf()
    }
}