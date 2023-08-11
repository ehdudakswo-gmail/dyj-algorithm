package baekjoon.p05063

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val (a, b, c) = readLine()!!.split(" ").map { it2 -> it2.toInt() }
        println(solve(a, b, c))
    }
}

private fun solve(vararg input: Int): String {
    val diff = input[0] - (input[1] - input[2])
    return when {
        diff < 0 -> "advertise"
        diff > 0 -> "do not advertise"
        else -> "does not matter"
    }
}