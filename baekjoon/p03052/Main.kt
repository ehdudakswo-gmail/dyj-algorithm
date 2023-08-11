package baekjoon.p03052

fun main(args: Array<String>) {
    val inputs = IntArray(10) { readLine()!!.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: IntArray): Int {
    return inputs.map { it % 42 }.distinct().size
}