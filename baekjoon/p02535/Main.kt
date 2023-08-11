package baekjoon.p02535

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) {
        val param = readLine()!!.split(" ").map { it.toInt() }
        P02535(param[0], param[1], param[2])
    }

    for (solve in solve(inputs)) {
        println("${solve.a} ${solve.b}")
    }
}

private fun solve(inputs: List<P02535>): List<P02535> {
    val sorted = inputs.sortedByDescending { it.score }
    val ret = ArrayList<P02535>()

    for (e in sorted) {
        if (ret.size < 2) {
            ret.add(e)
        } else if (!arrayOf(ret[0].a, ret[1].a).all { it == e.a }) {
            ret.add(e)
            break
        }
    }

    return ret
}

class P02535(val a: Int, val b: Int, val score: Int)