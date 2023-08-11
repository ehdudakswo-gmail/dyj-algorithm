package baekjoon.p01748

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(n: Int): Int {
    var ret = 0
    var i = 1

    while (i <= n) {
        ret += (n - i + 1)
        i *= 10
    }

    return ret
}