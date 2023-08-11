package baekjoon.p02669

fun main(args: Array<String>) {
    val inputs = List(4) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(inputs))
}

private fun solve(inputs: List<List<Int>>): Int {
    val arr = List(101) { BooleanArray(101) }
    for (e in inputs) {
        for (y in e[1] until e[3]) {
            arr[y].fill(true, e[0], e[2])
        }
    }

    return arr.sumBy { it.count { it } }
}