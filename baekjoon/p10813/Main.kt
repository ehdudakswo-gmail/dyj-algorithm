package baekjoon.p10813

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = List(m) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(n, inputs).joinToString(" "))
}

private fun solve(n: Int, inputs: List<List<Int>>): IntArray {
    val ret = (1..n).toList().toIntArray()

    for (input in inputs) {
        swap(ret, input[0] - 1, input[1] - 1)
    }

    return ret
}

private fun swap(arr: IntArray, a: Int, b: Int) {
    val temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp
}