package baekjoon.p11312

fun main() {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toLong() }
        println(solve(inputs[0], inputs[1]))
    }
}

private fun solve(a: Long, b: Long): Long {
    var ret = 0L
    var add = 1L
    val n = (a / b).toInt()

    repeat(n) {
        ret += add
        add += 2
    }

    return ret
}