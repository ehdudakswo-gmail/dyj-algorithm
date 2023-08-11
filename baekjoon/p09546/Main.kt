package baekjoon.p09546

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!.toInt()))
    }
}

private fun solve(k: Int): Int {
    var ret = 0.0
    repeat(k) {
        ret = (ret + 0.5) * 2
    }

    return ret.toInt()
}