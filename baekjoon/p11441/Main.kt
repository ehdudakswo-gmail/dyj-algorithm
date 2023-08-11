package baekjoon.p11441

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val m = readLine()!!.toInt()
    val b = List(m) {
        readLine()!!.split(" ").map { it.toInt() }
    }

    for (solve in solve(a, b)) {
        println(solve)
    }
}

private fun solve(a: List<Int>, b: List<List<Int>>): List<Int> {
    val n = a.size
    val sum = IntArray(n + 1)
    for (i in 1..n) {
        sum[i] = sum[i - 1] + a[i - 1]
    }

    return (0 until b.size).map {
        val start = b[it][0]
        val end = b[it][1]
        sum[end] - sum[start - 1]
    }
}