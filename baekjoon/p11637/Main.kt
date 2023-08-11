package baekjoon.p11637

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        val inputs = List(n) { readLine()!!.toInt() }
        println(solve(inputs))
    }
}

private fun solve(inputs: List<Int>): String {
    val max = inputs.max()!!
    val cnt = inputs.count { it == max }

    if (cnt != 1) {
        return "no winner"
    }

    val mid = inputs.sum() / 2
    val idx = inputs.indexOf(max)

    return when {
        (max > mid) -> "majority winner %d".format(idx + 1)
        else -> "minority winner %d".format(idx + 1)
    }
}