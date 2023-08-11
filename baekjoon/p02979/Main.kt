package baekjoon.p02979

fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = List(3) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(a, b, c, inputs))
}

private fun solve(a: Int, b: Int, c: Int, inputs: List<List<Int>>): Int {
    val cnt = IntArray(101)
    for (input in inputs) {
        for (i in input[0] until input[1]) {
            cnt[i]++
        }
    }

    var ret = 0
    val set = arrayOf(0, a, b, c)
    for (n in cnt) {
        ret += (n * set[n])
    }

    return ret
}