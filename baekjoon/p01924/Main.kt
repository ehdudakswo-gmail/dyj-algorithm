package baekjoon.p01924

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs[0], inputs[1]))
}

private fun solve(x: Int, y: Int): String {
    var diff = 0

    for (i in 1 until x) {
        diff += day(i)
    }

    diff += y
    diff %= 7

    for (value in Week.values()) {
        if (value.ordinal == diff) {
            return value.toString()
        }
    }

    return ""
}

private fun day(month: Int): Int {
    return when (month) {
        1, 3, 5, 7, 8, 10, 12 -> 31
        4, 6, 9, 11 -> 30
        else -> 28
    }
}

private enum class Week {

    SUN, MON, TUE, WED, THU, FRI, SAT;

}