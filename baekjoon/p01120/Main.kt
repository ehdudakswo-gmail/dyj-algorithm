package baekjoon.p01120

fun main() {
    val inputs = readLine()!!.split(" ")
    println(solve(inputs[0], inputs[1]))
}

private fun solve(a: String, b: String): Int {
    var ret = Int.MAX_VALUE
    for (i in 0..b.length - a.length) {
        val diff = (0 until a.length).count { a[it] != b[i + it] }
        ret = minOf(ret, diff)
    }

    return ret
}