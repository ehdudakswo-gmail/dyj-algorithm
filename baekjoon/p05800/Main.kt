package baekjoon.p05800

fun main(args: Array<String>) {
    val k = readLine()!!.toInt()
    for (i in 1..k) {
        val list = readLine()!!.split(" ").map { it.toInt() }
        val inputs = list.subList(1, list.size).toIntArray()
        val solve = solve(inputs)
        println("Class $i\nMax ${solve[0]}, Min ${solve[1]}, Largest gap ${solve[2]}")
    }
}

private fun solve(inputs: IntArray): IntArray {
    val list = inputs.sortedDescending()
    val list2 = list.zipWithNext().map { it.first - it.second }

    return intArrayOf(list.first(), list.last(), list2.max()!!)
}