package baekjoon.p07510

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        println("Scenario #$i:\n${solve(inputs)}\n")
    }
}

private fun solve(inputs: List<Int>): String {
    val sorted = inputs.sorted()
    val ret = (sorted[0] * sorted[0] + sorted[1] * sorted[1] == sorted[2] * sorted[2])

    return when (ret) {
        true -> "yes"
        false -> "no"
    }
}