package baekjoon.p05554

fun main(args: Array<String>) {
    val inputs = IntArray(4) { readLine()!!.toInt() }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: IntArray): IntArray {
    return intArrayOf(
            inputs.sum() / 60,
            inputs.sum() % 60
    )
}