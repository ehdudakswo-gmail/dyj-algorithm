package baekjoon.p05576

fun main(args: Array<String>) {
    val inputs = IntArray(20) { readLine()!!.toInt() }
    println(solve(inputs).joinToString(" "))
}

private fun solve(inputs: IntArray): IntArray {
    val list = inputs.toList().subList(0, 10)
    val list2 = inputs.toList().subList(10, 20)

    val sum = list.sortedDescending().subList(0, 3).sum()
    val sum2 = list2.sortedDescending().subList(0, 3).sum()

    return intArrayOf(sum, sum2)
}