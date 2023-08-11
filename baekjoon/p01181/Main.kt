package baekjoon.p01181

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!! }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: List<String>): List<String> {
    return inputs.distinct().sortedWith(compareBy({ it.length }, { it }))
}