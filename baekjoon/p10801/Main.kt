package baekjoon.p10801

fun main(args: Array<String>) {
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    println(solve(a, b))
}

private fun solve(a: List<Int>, b: List<Int>): String {
    val win = arrayOf(
            (0..a.lastIndex).count { a[it] > b[it] },
            (0..a.lastIndex).count { a[it] < b[it] }
    )

    return when {
        win[0] > win[1] -> "A"
        win[0] < win[1] -> "B"
        else -> "D"
    }
}