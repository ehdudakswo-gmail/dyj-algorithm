package baekjoon.p02947

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    for (solve in solve(inputs)) {
        println(solve.joinToString(" "))
    }
}

private fun solve(inputs: List<Int>): List<IntArray> {
    val ret = ArrayList<IntArray>()
    var arr = inputs.toIntArray()

    for (i in 0 until inputs.size - 1) {
        for (j in 0 until inputs.size - 1 - i) {
            if (arr[j] > arr[j + 1]) {
                arr = arr.clone()
                swap(arr, j, j + 1)
                ret.add(arr)
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