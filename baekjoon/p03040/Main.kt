package baekjoon.p03040

fun main(args: Array<String>) {
    val inputs = IntArray(9) { readLine()!!.toInt() }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: IntArray): IntArray {
    for (i in 0 until inputs.size) {
        for (j in i + 1 until inputs.size) {
            val list = inputs.filterIndexed { index, value -> (index != i && index != j) }
            if (list.sum() == 100) {
                return list.toIntArray()
            }
        }
    }

    return intArrayOf(-1)
}