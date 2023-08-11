package baekjoon.p01731

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!!.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: List<Int>): Int {
    return when (inputs[0] + inputs[2] == inputs[1] * 2) {
        true -> inputs.last() + (inputs[1] - inputs[0])
        false -> inputs.last() * (inputs[1] / inputs[0])
    }
}