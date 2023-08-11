package baekjoon.p08974

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs[0], inputs[1]))
}

private fun solve(a: Int, b: Int): Int {
    val arr = arr(b)
    return ((a - 1)..(b - 1)).sumBy { arr[it] }
}

private fun arr(n: Int): Array<Int> {
    val ret = Array(n) { 0 }
    var nn = 1
    var idx = 0

    while (true) {
        repeat(nn) {
            ret[idx++] = nn
            if (idx >= n) {
                return ret
            }
        }
        nn++
    }
}