package baekjoon.p01764

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val a = List(n) { readLine()!! }
    val b = List(m) { readLine()!! }

    val solves = solve(a, b)
    println(solves.size)
    println(solves.joinToString("\n"))
}

private fun solve(a: List<String>, b: List<String>): List<String> {
    return a.intersect(b).sorted()
}