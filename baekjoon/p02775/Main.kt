package baekjoon.p02775

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!.toInt(), readLine()!!.toInt()))
    }
}

private fun solve(k: Int, n: Int): Int {
    val arr = Array(k + 1) { IntArray(n + 1) { 0 } }
    arr[0] = (0 until arr[0].size).toList().toIntArray()

    for (i in 1 until arr.size) {
        for (j in 1 until arr[i].size) {
            arr[i][j] = arr[i][j - 1] + arr[i - 1][j]
        }
    }

    return arr[k][n]
}