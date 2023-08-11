package baekjoon.p12760

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.trim().split(" ").map { it.toInt() }
    val inputs = List(n) { readLine()!!.trim().split(" ").map { it.toInt() } }
    println(solve(inputs, n, m).joinToString(" "))
}

private fun solve(inputs: List<List<Int>>, n: Int, m: Int): List<Int> {
    val descending = (0 until n).map { inputs[it].sortedDescending() }
    val score = IntArray(n)

    for (i in 0 until m) {
        val temp = (0 until n).map { descending[it][i] }
        val max = temp.max()

        for (j in 0 until n) {
            if (descending[j][i] == max) {
                score[j]++
            }
        }
    }

    val max = score.max()
    return (0 until n).filter { score[it] == max }.map { it.inc() }
}