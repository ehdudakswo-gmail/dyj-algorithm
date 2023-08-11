package baekjoon.p11945

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    if (n == 0 || m == 0) {
        return
    }

    val inputs = List(n) { readLine()!! }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: List<String>): List<String> {
    return inputs.map { it.reversed() }
}