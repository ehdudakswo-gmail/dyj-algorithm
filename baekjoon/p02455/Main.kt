package baekjoon.p02455

fun main(args: Array<String>) {
    val n = 4
    val inputs = ArrayList<IntArray>(n)

    repeat(n) {
        val input = readLine()!!.trim().split(" ").map { input -> input.toInt() }.toIntArray()
        inputs.add(input)
    }

    println(solve(inputs))
}

private fun solve(inputs: ArrayList<IntArray>): Int {
    val list = IntArray(inputs.size)
    var cnt = 0

    for (i in 0 until list.size) {
        cnt -= inputs[i][0]
        cnt += inputs[i][1]
        list[i] = cnt
    }

    return list.max()!!.toInt()
}