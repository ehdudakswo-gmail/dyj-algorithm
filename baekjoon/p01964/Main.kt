package baekjoon.p01964

fun main(args: Array<String>) {
    println(solve(readLine()!!.toLong()))
}

private fun solve(n: Long): Long {
    var sum = 5L
    for (i in 2..n) {
        sum += (i * 2 + i + 1)
    }

    return sum % 45678
}