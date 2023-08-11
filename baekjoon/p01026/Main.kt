package baekjoon.p01026

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    println(solve(a, b))
}

private fun solve(a: List<Int>, b: List<Int>): Int {
    val sortedA = a.sorted()
    val reversedB = b.sortedDescending()

    return (0..a.lastIndex).sumBy { sortedA[it] * reversedB[it] }
}