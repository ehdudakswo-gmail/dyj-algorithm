package baekjoon.p02857

fun main(args: Array<String>) {
    val inputs = Array(5) { readLine()!! }
    val solves = solve(inputs)

    if (solves.isEmpty()) {
        println("HE GOT AWAY!")
    } else {
        println(solves.joinToString(" "))
    }
}

private fun solve(inputs: Array<String>): IntArray {
    return (0 until inputs.size).filter { "FBI" in inputs[it] }.map { it.inc() }.toIntArray()
}