package baekjoon.p01158

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs[0], inputs[1]).joinToString(separator = ", ", prefix = "<", postfix = ">"))
}

private fun solve(n: Int, m: Int): List<Int> {
    val list = (1..n).toMutableList()
    val ret = ArrayList<Int>()

    var idx = 0
    while (list.isNotEmpty()) {
        idx = (idx + m - 1) % list.size
        ret.add(list.removeAt(idx))
    }

    return ret
}