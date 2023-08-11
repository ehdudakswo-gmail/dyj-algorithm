package baekjoon.p01568

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(input: Int): Int {
    var ret = 0
    var n = input
    var i = 1

    while (n > 0) {
        if (i > n) {
            i = 1
        }
        n -= i
        i++
        ret++
    }

    return ret
}