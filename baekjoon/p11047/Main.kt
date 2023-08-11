package baekjoon.p11047

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = IntArray(n) { readLine()!!.toInt() }
    println(solve(inputs, k))
}

private fun solve(inputs: IntArray, k: Int): Int {
    var ret = 0
    var remain = k

    for (input in inputs.sortedDescending()) {
        ret += (remain / input)
        remain = (remain % input)
    }

    return ret
}