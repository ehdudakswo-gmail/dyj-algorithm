package baekjoon.p11948

fun main(args: Array<String>) {
    val inputs = List(6) { readLine()!!.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: List<Int>): Int {
    val a = inputs.subList(0, 4)
    val b = inputs.subList(4, 6)

    return a.sum() - a.min()!! + b.sum() - b.min()!!
}