package baekjoon.p03004

fun main() {
    println(solve(readLine()!!.toInt()))
}

private fun solve(n: Int): Int {
    var ret = 2
    var add = 2

    for (i in 1 until n) {
        ret += add
        if (i % 2 == 0) {
            add++
        }
    }

    return ret
}