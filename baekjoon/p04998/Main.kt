package baekjoon.p04998

fun main() {
    while (true) {
        val input = readLine() ?: break
        val inputs = input.trim().split(" ").map { it.toDouble() }
        println(solve(inputs[0], inputs[1], inputs[2]))
    }
}

private fun solve(n: Double, b: Double, m: Double): Int {
    var ret = 0
    var nn = n

    while (nn < m) {
        nn += (nn * b * 0.01)
        ret++
    }

    return ret
}