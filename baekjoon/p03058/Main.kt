package baekjoon.p03058

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        println(solve(inputs).joinToString("\n"))
    }
}

private fun solve(inputs: IntArray): IntArray {
    val list = inputs.filter { it % 2 == 0 }
    return intArrayOf(list.sum(), list.min()!!)
}