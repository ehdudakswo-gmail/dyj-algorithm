package baekjoon.p10163

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: List<List<Int>>): List<Int> {
    val arr = Array(102) { IntArray(102) }
    for (i in 0 until inputs.size) {
        val (x, y, w, h) = inputs[i]
        for (j in y until y + h) {
            arr[j].fill(i + 1, x, x + w)
        }
    }

    return (0 until inputs.size).map { idx -> arr.sumBy { arr -> arr.count { it == idx + 1 } } }
}