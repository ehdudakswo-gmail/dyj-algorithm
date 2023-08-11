package baekjoon.p01531

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = List(n) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(inputs, m))
}

private fun solve(inputs: List<List<Int>>, m: Int): Int {
    val arr = Array(101) { IntArray(101) }
    for (e in inputs) {
        inc(arr, e[0], e[1], e[2], e[3])
    }

    return arr.sumBy { it.count { it > m } }
}

private fun inc(arr: Array<IntArray>, y0: Int, x0: Int, y1: Int, x1: Int) {
    for (y in y0..y1) {
        for (x in x0..x1) {
            arr[y][x]++
        }
    }
}