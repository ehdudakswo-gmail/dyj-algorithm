package baekjoon.p02438

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (ret in solve(n)) {
        println(ret)
    }
}

private fun solve(n: Int): Array<String> {
    val ret = Array(n) { "" }

    for (i in 0 until ret.size) {
        ret[i] = "*".repeat(i + 1)
    }

    return ret
}