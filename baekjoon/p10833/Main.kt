package baekjoon.p10833

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = Array(n) { IntArray(2) }

    for (input in inputs) {
        val arr = readLine()!!.split(" ").map { it.toInt() }
        input[0] = arr[0]
        input[1] = arr[1]
    }

    println(solve(inputs))
}

private fun solve(inputs: Array<IntArray>): Int {
    var ret = 0

    for (input in inputs) {
        ret += (input[1] % input[0])
    }

    return ret
}