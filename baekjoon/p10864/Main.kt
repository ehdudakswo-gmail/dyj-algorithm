package baekjoon.p10864

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = List(m) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(n, inputs).joinToString("\n"))
}

private fun solve(n: Int, inputs: List<List<Int>>): Array<Int> {
    val ret = Array(n) { 0 }
    for (input in inputs) {
        ret[input[0] - 1]++
        ret[input[1] - 1]++
    }

    return ret
}