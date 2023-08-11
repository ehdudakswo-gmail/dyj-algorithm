package baekjoon.p01789

fun main(args: Array<String>) {
    val s = readLine()!!.toLong()
    val n = solve(s)
    println(n)
}

private fun solve(_s: Long): Int {
    var s = _s
    var i = 1
    var n = 0

    while (i <= s) {
        s -= i
        n++
        i++
    }

    return n
}