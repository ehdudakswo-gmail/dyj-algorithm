package baekjoon.p02441

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
        val blank = i
        val star = (size - i)
        ret[i] = " ".repeat(blank) + "*".repeat(star)
    }

    return ret
}