package baekjoon.p02439

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (ret in solve(n)) {
        println(ret)
    }
}

private fun solve(n: Int): Array<String> {
    val ret = Array(n) { "" }
    val size = ret.size

    for (i in 0 until size) {
        val star = (i + 1)
        val blank = (size - star)
        ret[i] = " ".repeat(blank) + "*".repeat(star)
    }

    return ret
}