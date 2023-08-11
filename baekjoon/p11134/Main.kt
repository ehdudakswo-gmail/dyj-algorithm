package baekjoon.p11134

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val (n, c) = readLine()!!.split(" ").map { it.toInt() }
        println(solve(n, c))
    }
}

private fun solve(n: Int, c: Int): Int {
    return when (n % c == 0) {
        true -> n / c
        false -> n / c + 1
    }
}