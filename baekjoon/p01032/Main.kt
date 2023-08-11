package baekjoon.p01032

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = Array(n) { readLine()!! }
    println(solve(inputs))
}

private fun solve(inputs: Array<String>): String {
    return inputs[0].mapIndexed { i, c ->
        if (inputs.filter { it[i] == c }.size == inputs.size) {
            c
        } else {
            '?'
        }
    }.joinToString("")
}