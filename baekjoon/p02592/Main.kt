package baekjoon.p02592

fun main(args: Array<String>) {
    val inputs = IntArray(10) { readLine()!!.toInt() }

    for (solve in solve(inputs)) {
        println(solve)
    }
}

private fun solve(inputs: IntArray): IntArray {
    return intArrayOf(
            inputs.average().toInt(),
            inputs.maxBy { value -> inputs.count { value == it } }!!
    )
}