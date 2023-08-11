package baekjoon.p09295

fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    val inputs = Array(t) { IntArray(2) }

    for (i in 0 until inputs.size) {
        inputs[i] = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    }

    println(solve(inputs))
}

private fun solve(inputs: Array<IntArray>): String {
    return buildString {
        for (i in 0 until inputs.size) {
            append("Case ${i + 1}: ${inputs[i][0] + inputs[i][1]}")
            appendln()
        }
    }
}