package baekjoon.p10768

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt(), readLine()!!.toInt()))
}

private fun solve(a: Int, b: Int): String {
    return when {
        a < 2 -> "Before"
        a > 2 -> "After"
        else -> when {
            b < 18 -> "Before"
            b > 18 -> "After"
            else -> "Special"
        }
    }
}