package baekjoon.p09550

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val (n, k) = readLine()!!.split(" ").map { it.toInt() }
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        println(solve(k, inputs))
    }
}

private fun solve(k: Int, inputs: List<Int>): Int {
    return inputs.sumBy { it / k }
}