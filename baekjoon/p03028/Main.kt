package baekjoon.p03028

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): Int {
    val arr = intArrayOf(1, 0, 0)
    val set = arrayOf(arrayOf(0, 1), arrayOf(1, 2), arrayOf(0, 2))

    for (ch in input) {
        val idx = set[ch - 'A']
        swap(arr, idx[0], idx[1])
    }

    return arr.indexOf(1) + 1
}

private fun swap(arr: IntArray, a: Int, b: Int) {
    val aa = arr[a]
    val bb = arr[b]
    arr[a] = bb
    arr[b] = aa
}