package baekjoon.p09455

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val (n, m) = readLine()!!.split(" ").map { it.toInt() }
        val inputs = List(n) { readLine()!!.split(" ").map { it.toInt() } }
        println(solve(inputs, n, m))
    }
}

private fun solve(inputs: List<List<Int>>, n: Int, m: Int): Int {
    var ret = 0
    for (x in 0 until m) {
        var cnt = 0
        for (y in n - 1 downTo 0) {
            when (inputs[y][x] == 1) {
                true -> ret += cnt
                false -> cnt++
            }
        }
    }

    return ret
}