package baekjoon.p09094

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        println(solve(inputs[0], inputs[1]))
    }
}

private fun solve(n: Int, m: Int): Int {
    var ret = 0

    for (a in 1 until n) {
        for (b in a + 1 until n) {
            if ((a * a + b * b + m) % (a * b) == 0) {
                ret++
            }
        }
    }

    return ret
}