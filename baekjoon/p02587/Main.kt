package baekjoon.p02587

fun main(args: Array<String>) {
    val inputs = IntArray(5) { readLine()!!.toInt() }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: IntArray): IntArray {
    val avg = inputs.average().toInt()
    val mid = inputs.sorted()[inputs.size / 2]

    return intArrayOf(avg, mid)
}