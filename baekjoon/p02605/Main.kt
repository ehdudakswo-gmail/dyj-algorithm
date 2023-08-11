package baekjoon.p02605

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.trim().split(" ").map { it.toInt() }
    print(solve(inputs).joinToString(" "))
}

private fun solve(inputs: List<Int>): List<Int> {
    val ret = ArrayList<Int>()
    for (i in 0 until inputs.size) {
        val idx = ret.size - inputs[i]
        ret.add(idx, i + 1)
    }

    return ret
}