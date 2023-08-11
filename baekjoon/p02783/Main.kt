package baekjoon.p02783

fun main() {
    val inputs = ArrayList<List<Int>>()
    val first = readLine()!!.split(" ").map { it.toInt() }
    inputs.add(first)

    val n = readLine()!!.toInt()
    repeat(n) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        inputs.add(input)
    }

    println(solve(inputs))
}

private fun solve(inputs: List<List<Int>>): String {
    val list = (0 until inputs.size).map { (inputs[it][0] * 1000.toDouble()) / inputs[it][1] }
    val min = list.min()

    return String.format("%.2f", min);
}