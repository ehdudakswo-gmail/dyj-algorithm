package baekjoon.p11109

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        println(solve(inputs))
    }
}

private fun solve(inputs: List<Int>): String {
    val a = inputs[0] + inputs[1] * inputs[3]
    val b = inputs[1] * inputs[2]

    return when {
        a < b -> "parallelize"
        a > b -> "do not parallelize"
        else -> "does not matter"
    }
}