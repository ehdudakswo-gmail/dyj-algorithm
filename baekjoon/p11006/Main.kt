package baekjoon.p11006

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        println(solve(inputs[0], inputs[1]).joinToString(" "))
    }
}

private fun solve(n: Int, m: Int): IntArray {
    return intArrayOf(
            m * 2 - n,
            m - (m * 2 - n)
    )
}