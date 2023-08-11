package baekjoon.p01822

fun main(args: Array<String>) {
    val (m, n) = readLine()!!.trim().split(" ").map { it.toInt() }
    val a = readLine()!!.trim().split(" ").map { it.toInt() }
    val b = readLine()!!.trim().split(" ").map { it.toInt() }

    val solve = solve(a, b)
    println(solve.size)
    println(solve.joinToString(" "))
}

private fun solve(a: List<Int>, b: List<Int>): List<Int> {
    return (a - b).sorted()
}