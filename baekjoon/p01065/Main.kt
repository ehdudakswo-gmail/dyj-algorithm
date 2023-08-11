package baekjoon.p01065

fun main() {
    println(solve(readLine()!!.toInt()))
}

private fun solve(n: Int): Int {
    return (1..n).count { check(it) }
}

private fun check(n: Int): Boolean {
    if (n < 100) {
        return true
    }

    val arr = n.toString().map { it - '0' }
    val diff = arr[0] - arr[1]

    for (i in 0 until arr.size - 1) {
        if (arr[i] - arr[i + 1] != diff) {
            return false
        }
    }

    return true
}