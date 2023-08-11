package baekjoon.p01431

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!! }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: List<String>): List<String> {
    return inputs.sortedWith(compareBy({ it.length }, { sum(it) }, { it }))
}

private fun sum(str: String): Int {
    return str.filter { it.isDigit() }.sumBy { it - '0' }
}