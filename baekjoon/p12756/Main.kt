package baekjoon.p12756

fun main(args: Array<String>) {
    val inputs = List(2) { readLine()!!.split(" ").map { it.toInt() }.toIntArray() }
    println(solve(inputs))
}

private fun solve(inputs: List<IntArray>): String {
    while (inputs[0][1] > 0 && inputs[1][1] > 0) {
        inputs[0][1] -= inputs[1][0]
        inputs[1][1] -= inputs[0][0]
    }

    return when {
        (inputs[0][1] <= 0 && inputs[1][1] <= 0) -> "DRAW"
        (inputs[0][1] > 0) -> "PLAYER A"
        else -> "PLAYER B"
    }
}