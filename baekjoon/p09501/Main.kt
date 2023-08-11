package baekjoon.p09501

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val (n, d) = readLine()!!.split(" ").map { it.toInt() }
        val inputs = List(n) { readLine()!!.split(" ").map { it.toInt() } }
        println(solve(inputs, d))
    }
}

private fun solve(input: List<List<Int>>, d: Int): Int {
    return input.count { it[0] * it[1] >= it[2] * d }
}