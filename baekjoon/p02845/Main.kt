package baekjoon.p02845

fun main(args: Array<String>) {
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }

    println(solve(a, b).joinToString(" "))
}

private fun solve(a: List<Int>, b: List<Int>): List<Int> {
    val n = a[0] * a[1]
    return (0 until b.size).map { b[it] - n }
}