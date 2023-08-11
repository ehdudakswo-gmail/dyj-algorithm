package baekjoon.p02948

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs[0], inputs[1]))
}

private fun solve(d: Int, m: Int): String {
    val days = arrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val weeks = arrayOf("Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday")

    var total = d
    for (i in 1 until m) {
        total += days[i]
    }

    return weeks[total % 7]
}