package baekjoon.p12788

fun main() {
    val n = readLine()!!.trim().toInt()
    val (m, k) = readLine()!!.trim().split(" ").map { it.toInt() }
    val inputs = readLine()!!.trim().split(" ").map { it.toInt() }
    println(solve(inputs, m, k))
}

private fun solve(inputs: List<Int>, m: Int, k: Int): String {
    val descending = inputs.sortedDescending()
    val target = (m * k)
    var sum = 0

    for (i in 0 until descending.size) {
        sum += descending[i]
        if (sum >= target) {
            return (i + 1).toString()
        }
    }

    return "STRESS"
}