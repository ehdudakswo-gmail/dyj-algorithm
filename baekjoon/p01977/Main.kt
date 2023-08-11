package baekjoon.p01977

import kotlin.math.sqrt

fun main(args: Array<String>) {
    val m = readLine()!!.toInt()
    val n = readLine()!!.toInt()

    for (num in solve(m, n)) {
        println(num)
    }
}

private fun solve(m: Int, n: Int): IntArray {
    val ret = IntArray(2)
    val list = ArrayList<Int>()

    var sqrt = sqrt(m.toFloat()).toInt()
    if (sqrt * sqrt < m) {
        sqrt++
    }

    while (true) {
        val num = sqrt * sqrt
        if (num > n) {
            break
        }

        list.add(num)
        sqrt++
    }

    if (list.size == 0) {
        return IntArray(1) { -1 }
    }

    ret[0] = list.sum()
    ret[1] = list[0]

    return ret
}