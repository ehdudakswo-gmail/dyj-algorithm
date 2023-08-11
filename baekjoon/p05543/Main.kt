package baekjoon.p05543

fun main(args: Array<String>) {
    val inputs = IntArray(5) { readLine()!!.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: IntArray): Int {
    val min = inputs.copyOfRange(0, 3).min()!!
    val min2 = inputs.copyOfRange(3, 5).min()!!

    return (min + min2 - 50)
}