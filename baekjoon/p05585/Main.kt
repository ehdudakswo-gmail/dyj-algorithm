package baekjoon.p05585

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(input: Int): Int {
    val set = arrayOf(500, 100, 50, 10, 5, 1)
    var ret = 0
    var n = 1000 - input

    for (s in set) {
        ret += (n / s)
        n %= s
    }

    return ret
}