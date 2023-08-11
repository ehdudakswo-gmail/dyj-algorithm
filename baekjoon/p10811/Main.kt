package baekjoon.p10811

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = List(m) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(n, inputs).joinToString(" "))
}

private fun solve(n: Int, inputs: List<List<Int>>): IntArray {
    val ret = (1..n).toList().toIntArray()
    for (input in inputs) {
        reverse(ret, input[0] - 1, input[1] - 1)
    }

    return ret
}

private fun reverse(arr: IntArray, from: Int, to: Int) {
    var i = from
    var j = to

    while (i <= j) {
        swap(arr, i, j)
        i++
        j--
    }
}

private fun swap(arr: IntArray, a: Int, b: Int) {
    val temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp
}