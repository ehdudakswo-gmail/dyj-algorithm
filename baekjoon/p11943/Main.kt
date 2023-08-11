package baekjoon.p11943

fun main(args: Array<String>) {
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    println(solve(a, b))
}

private fun solve(a: List<Int>, b: List<Int>): Int {
    return minOf(a[0] + b[1], a[1] + b[0])
}