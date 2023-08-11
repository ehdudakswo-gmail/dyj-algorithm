package baekjoon.p04470

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!! }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: List<String>): List<String> {
    return (0..inputs.lastIndex).map { "${it + 1}. ${inputs[it]}" }
}