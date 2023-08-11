package baekjoon.p01551

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = readLine()!!.split(",").map { it.toInt() }
    println(solve(inputs, k).joinToString(","))
}

private fun solve(inputs: List<Int>, k: Int): List<Int> {
    var ret = inputs
    repeat(k) {
        ret = ret.zipWithNext { a, b -> b - a }
    }

    return ret;
}