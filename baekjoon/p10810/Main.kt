package baekjoon.p10810

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = List(m) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(n, inputs).joinToString(" "))
}

private fun solve(n: Int, inputs: List<List<Int>>): Array<Int> {
    val ret = Array(n) { 0 }
    for (input in inputs) {
        ret.fill(input[2], input[0] - 1, input[1])
    }

    return ret
}