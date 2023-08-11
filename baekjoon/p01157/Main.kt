package baekjoon.p01157

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): Char {
    val upper = input.toUpperCase()
    val cnt = ('A'..'Z').map { ch -> upper.count { it == ch } }
    val max = cnt.max()!!

    return when (cnt.count { it == max }) {
        1 -> (cnt.indexOf(max) + 'A'.toInt()).toChar()
        else -> '?'
    }
}