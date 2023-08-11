package baekjoon.p02822

fun main(args: Array<String>) {
    val inputs = IntArray(8) { readLine()!!.toInt() }
    val solves = solve(inputs)

    println(solves.map { inputs[it] }.sum())
    println(solves.map { it.inc() }.joinToString(" "))
}

private fun solve(inputs: IntArray): List<Int> {
    val list = inputs.sortedDescending()
    val hashSet = HashSet<Int>()

    for (i in 0..4) {
        hashSet.add(list[i])
    }

    val ret = ArrayList<Int>()
    for (i in 0 until inputs.size) {
        if (hashSet.contains(inputs[i])) {
            ret.add(i)
        }
    }

    return ret
}