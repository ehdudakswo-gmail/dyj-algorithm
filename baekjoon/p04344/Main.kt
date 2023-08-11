package baekjoon.p04344

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }.filterIndexed { index, i -> index >= 1 }
        println(solve(inputs))
    }
}

private fun solve(inputs: List<Int>): String {
    val avg = inputs.average()
    val cnt = inputs.count { it > avg }
    val percent = cnt.toDouble() / inputs.size * 100

    return "%.3f%%".format(percent)
}