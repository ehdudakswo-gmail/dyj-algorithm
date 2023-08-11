package baekjoon.p08393

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println(solve(n))
}

private fun solve(n: Int): Int {
    var ret = 0

    for (i in 1..n) {
        ret += i
    }

    return ret
}