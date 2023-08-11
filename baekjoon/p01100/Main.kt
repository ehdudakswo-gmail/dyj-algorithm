package baekjoon.p01100

fun main(args: Array<String>) {
    val inputs = List(8) { readLine()!!.toCharArray() }
    println(solve(inputs))
}

private fun solve(inputs: List<CharArray>): Int {
    var ret = 0

    for (i in 0 until inputs.size) {
        for (j in 0 until inputs[i].size) {
            if (inputs[i][j] == 'F' && isWhite(i, j)) {
                ret++
            }
        }
    }

    return ret
}

private fun isWhite(i: Int, j: Int): Boolean {
    return when {
        (i % 2 == 0) -> j % 2 == 0
        (i % 2 == 1) -> j % 2 == 1
        else -> false
    }
}