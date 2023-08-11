package baekjoon.p10419

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!.toInt()))
    }
}

private fun solve(d: Int): Int {
    var t = 0

    while (t * (t + 1) <= d) {
        t++
    }

    return (t - 1)
}