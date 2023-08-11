package baekjoon.p10808

fun main(args: Array<String>) {
    println(solve(readLine()!!).joinToString(" "))
}

private fun solve(input: String): IntArray {
    return ('a'..'z').map { ch -> input.count { ch == it } }.toIntArray()
}