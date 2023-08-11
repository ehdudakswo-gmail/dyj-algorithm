package baekjoon.p09610

fun main(args: Array<String>) {
    val input = ArrayList<Pair<Int, Int>>()
    val n = readLine()!!.toInt()

    repeat(n) {
        val (x, y) = readLine()!!.split(" ").map { it2 -> it2.toInt() }
        input.add(Pair(x, y))
    }

    for (str in solve(input)) {
        println(str)
    }
}

private fun solve(input: ArrayList<Pair<Int, Int>>): ArrayList<String> {
    val ret = ArrayList<String>()
    val q = IntArray(5)

    for (pair in input) {
        val x = pair.first
        val y = pair.second

        when {
            (x == 0 || y == 0) -> q[0]++
            (x > 0 && y > 0) -> q[1]++
            (x < 0 && y > 0) -> q[2]++
            (x < 0 && y < 0) -> q[3]++
            (x > 0 && y < 0) -> q[4]++
        }
    }

    for (i in 1..4) {
        ret.add("Q$i: ${q[i]}")
    }
    ret.add("AXIS: ${q[0]}")

    return ret
}