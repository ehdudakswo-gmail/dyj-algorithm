package baekjoon.p02399

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map { it.toLong() }
    println(solve(inputs))
}

private fun solve(inputs: List<Long>): Long {
    val sorted = inputs.sorted()
    val size = inputs.size
    var ret = 0L

    for (i in 0 until size) {
        for (j in i + 1 until size) {
            ret += (sorted[j] - sorted[i])
        }
    }

    ret *= 2
    return ret
}