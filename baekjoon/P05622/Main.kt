package baekjoon.P05622

fun main() {
    println(solve(readLine()!!))
}

private fun solve(input: String): Int {
    return input.sumBy {
        num(it) + 1
    }
}

private fun num(ch: Char): Int {
    return when (ch) {
        in "ABC" -> 2
        in "DFE" -> 3
        in "GHI" -> 4
        in "JKL" -> 5
        in "MNO" -> 6
        in "PQRS" -> 7
        in "TUV" -> 8
        in "WXYZ" -> 9
        else -> -1
    }
}