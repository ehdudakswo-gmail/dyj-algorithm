package baekjoon.p12759

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(9) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(n, inputs))
}

private fun solve(n: Int, inputs: List<List<Int>>): Int {
    var p = n
    val arr = Array(3) { IntArray(3) }

    for (e in inputs) {
        val y = e[0] - 1
        val x = e[1] - 1
        arr[y][x] = p
        if (check(arr, p)) return p
        p = (p % 2 + 1)
    }

    return 0
}

private fun check(arr: Array<IntArray>, n: Int): Boolean {
    val size = arr.size
    for (e in arr) {
        if (e.all { it == n }) return true
    }

    for (x in 0 until size) {
        if ((0 until size).map { arr[it][x] }.all { it == n }) return true
    }

    if ((0 until size).map { arr[it][it] }.all { it == n }) return true
    if ((0 until size).map { arr[it][size - it - 1] }.all { it == n }) return true

    return false
}