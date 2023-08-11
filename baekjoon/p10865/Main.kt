package baekjoon.p10865

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = List(m) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(n, inputs).joinToString("\n"))
}

private fun solve(n: Int, inputs: List<List<Int>>): IntArray {
    val ret = IntArray(n)
    for (input in inputs) {
        val a = input[0]
        val b = input[1]
        ret[a - 1]++
        ret[b - 1]++
    }

    return ret
}