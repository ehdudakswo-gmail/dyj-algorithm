package baekjoon.p02490

fun main(args: Array<String>) {
    repeat(3) {
        val inputs = readLine()!!.split(" ").map { input -> input.toInt() }.toIntArray()
        println(solve(inputs))
    }
}

private fun solve(inputs: IntArray): String {
    return when (inputs.count { it == 0 }) {
        1 -> "A"
        2 -> "B"
        3 -> "C"
        4 -> "D"
        else -> "E"
    }
}