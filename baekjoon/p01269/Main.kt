package baekjoon.p01269

fun main(args: Array<String>) {
    val (aa, bb) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    println(solve(a, b))
}

private fun solve(a: List<Int>, b: List<Int>): Int {
    return (a - b).size + (b - a).size
}