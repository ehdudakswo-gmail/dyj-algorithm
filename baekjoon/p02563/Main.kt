package baekjoon.p02563

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(inputs))
}

private fun solve(inputs: List<List<Int>>): Int {
    val check = Array(100) { BooleanArray(100) }
    val len = 10

    for (e in inputs) {
        val x = e[0]
        val y = e[1]
        for (i in y until y + len) {
            check[i].fill(true, x, x + len)
        }
    }

    return check.sumBy { it.count { it } }
}