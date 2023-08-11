package baekjoon.p05575

fun main(args: Array<String>) {
    val inputs = List(3) { readLine()!!.split(" ").map { it.toInt() } }
    for (solve in solve(inputs)) {
        println(solve.joinToString(" "))
    }
}

private fun solve(inputs: List<List<Int>>): Array<Array<Int>> {
    val ret = Array(3) { Array(3) { 0 } }

    for (i in 0 until inputs.size) {
        val diff = seconds(inputs[i][3], inputs[i][4], inputs[i][5]) - seconds(inputs[i][0], inputs[i][1], inputs[i][2])
        ret[i][0] = diff / 3600
        ret[i][1] = (diff % 3600) / 60
        ret[i][2] = diff % 60
    }

    return ret
}

private fun seconds(h: Int, m: Int, s: Int): Int {
    return (3600 * h + 60 * m + s)
}