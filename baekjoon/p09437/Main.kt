package baekjoon.p09437

fun main(args: Array<String>) {
    while (true) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        if (input[0] == 0) break
        println(solve(input[0], input[1]).joinToString(" "))
    }
}

private fun solve(n: Int, p: Int): List<Int> {
    val set = Array(n / 4) { Array(4) { 0 } }
    for (i in 0 until set.size) {
        set[i][0] = i * 2 + 1
        set[i][1] = set[i][0] + 1
        set[i][2] = n - set[i][0]
        set[i][3] = set[i][2] + 1
    }

    return set.find { it.contains(p) }!!.filter { it != p }
}