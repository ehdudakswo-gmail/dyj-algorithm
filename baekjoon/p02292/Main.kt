package baekjoon.p02292

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(n: Int): Int {
    var cnt = 1
    var last = 1

    while (n > last) {
        last += (cnt * 6)
        cnt++
    }

    return cnt
}