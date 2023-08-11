package baekjoon.p10570

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val v = readLine()!!.toInt()
        val inputs = List(v) { readLine()!!.toInt() }
        println(solve(inputs))
    }
}

private fun solve(inputs: List<Int>): Int {
    val cnt = IntArray(1001)
    for (e in inputs) {
        cnt[e]++
    }

    val max = cnt.max()
    return cnt.indexOfFirst { it == max }
}