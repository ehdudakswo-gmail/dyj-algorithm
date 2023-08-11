package baekjoon.p02921

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println(solve(n))
}

private fun solve(n: Int): Int {
    var ret = 0

    for (i in 0..n) {
        for (j in 0..i) {
            ret += (i + j)
        }
    }

    return ret
}