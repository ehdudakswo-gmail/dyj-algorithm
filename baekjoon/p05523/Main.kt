package baekjoon.p05523

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(inputs).joinToString(" "))
}

private fun solve(inputs: List<List<Int>>): IntArray {
    return intArrayOf(
            inputs.count { it[0] > it[1] },
            inputs.count { it[0] < it[1] }
    )
}