package baekjoon.p05361

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        println(solve(inputs))
    }
}

private fun solve(inputs: List<Int>): String {
    val set = arrayOf(
            350.34,
            230.90,
            190.55,
            125.30,
            180.90
    )

    return "$%.2f".format((0 until set.size).map { set[it] * inputs[it] }.sum())
}