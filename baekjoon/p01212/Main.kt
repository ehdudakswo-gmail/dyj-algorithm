package baekjoon.p01212

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): String {
    val set = arrayOf("000", "001", "010", "011", "100", "101", "110", "111")
    val ret = buildString {
        for (ch in input) {
            append(set[ch - '0'])
        }
    }

    val idx = ret.indexOf("1")
    return when (idx) {
        -1 -> "0"
        else -> ret.substring(idx)
    }
}