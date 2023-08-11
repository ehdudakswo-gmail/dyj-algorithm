package baekjoon.p06359

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!.toInt()))
    }
}

private fun solve(n: Int): Int {
    val arr = BooleanArray(n + 1)
    for (i in 1..n) {
        for (j in i..n step i) {
            arr[j] = !arr[j]
        }
    }

    return (1..n).count { arr[it] }
}