package baekjoon.p02506

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.trim().split(" ").map { it.toInt() }.toIntArray()

    val ret = solve(inputs)
    println(ret)
}

private fun solve(inputs: IntArray): Int {
    var ret = 0
    var sum = 0

    for (input in inputs) {
        if (input == 1) {
            sum++
            ret += sum
        } else {
            sum = 0
        }
    }

    return ret
}