package baekjoon.p02739

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (ret in solve(n)) {
        println(ret)
    }
}

private fun solve(n: Int): Array<String> {
    val ret = Array(9) { "" }

    for (i in 0 until ret.size) {
        ret[i] = "$n * ${(i + 1)} = ${(i + 1) * n}"
    }

    return ret
}