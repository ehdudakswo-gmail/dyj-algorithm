package baekjoon.p02997

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: List<Int>): Int {
    val sorted = inputs.sorted()
    val diff = minOf(sorted[1] - sorted[0], sorted[2] - sorted[1])

    for (i in 1..4) {
        val n = sorted[0] + diff * i
        if (!sorted.contains(n)) {
            return n
        }
    }

    return 0
}