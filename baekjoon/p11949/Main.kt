package baekjoon.p11949

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = List(n) { readLine()!!.toInt() }

    for (solve in solve(n, m, inputs)) {
        println(solve)
    }
}

private fun solve(n: Int, m: Int, inputs: List<Int>): IntArray {
    val ret = inputs.toIntArray()

    for (i in 1..m) {
        for (j in 0 until n - 1) {
            if (ret[j] % i > ret[j + 1] % i) {
                swap(ret, j, j + 1)
            }
        }
    }

    return ret
}

private fun swap(arr: IntArray, a: Int, b: Int) {
    val temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp
}