package baekjoon.p02884

fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val ret = solve(x, y)
    println("${ret[0]} ${ret[1]}")
}

private fun solve(h: Int, m: Int): Array<Int> {
    val ret = Array(2) { 0 }
    val totalM = 60 * h + m
    var retM = totalM - 45

    if (retM < 0) {
        retM += (60 * 24)
    }

    ret[0] = retM / 60
    ret[1] = retM % 60
    return ret
}