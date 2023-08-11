package baekjoon.p01427

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println(solve(n))
}

private fun solve(n: Int): Int {
    return n.toString().toList().sortedDescending().joinToString("").toInt()
}