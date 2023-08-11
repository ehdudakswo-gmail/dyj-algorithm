package baekjoon.p10179

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!.toDouble()))
    }
}

private fun solve(input: Double): String {
    return "$%.2f".format(input * 0.8)
}