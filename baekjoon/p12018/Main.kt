package baekjoon.p12018

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = List(n) {
        val (p, l) = readLine()!!.trim().split(" ").map { it.toInt() }
        val list = readLine()!!.split(" ").map { it.toInt() }
        P12018(p, l, list)
    }

    println(solve(n, m, inputs))
}

private fun solve(n: Int, m: Int, inputs: List<P12018>): Int {
    val min = (0 until n).map { inputs[it].getMin() }.sorted()
    var sum = 0

    for (i in 0 until min.size) {
        sum += min[i]
        if (sum > m) {
            return i
        }
    }

    return n
}

private class P12018(val p: Int, val l: Int, val list: List<Int>) {
    fun getMin(): Int {
        return when (p < l) {
            true -> 1
            false -> list.sorted()[p - l]
        }
    }
}