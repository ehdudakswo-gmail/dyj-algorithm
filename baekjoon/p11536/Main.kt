package baekjoon.p11536

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!! }
    println(solve(inputs))
}

private fun solve(inputs: List<String>): String {
    val sorted = inputs.sorted()
    val descending = inputs.sortedDescending()

    return when {
        (inputs == sorted) -> "INCREASING"
        (inputs == descending) -> "DECREASING"
        else -> "NEITHER"
    }
}