package baekjoon.p01855

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt(), readLine()!!))
}

private fun solve(k: Int, str: String): String {
    val x = k
    val y = str.length / x
    val arr = Array(y) { CharArray(x) }

    var seq = 0
    for (i in 0 until y) {
        for (j in 0 until x) {
            arr[i][j] = str[seq++]
        }
        if (i % 2 == 1) {
            arr[i].reverse()
        }
    }

    return buildString {
        for (i in 0 until x) {
            for (j in 0 until y) {
                append(arr[j][i])
            }
        }
    }
}