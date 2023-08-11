package baekjoon.p05988

fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        println(solve(readLine()!!))
    }
}

private fun solve(k: String): String {
    return when (k.last().toInt() % 2 == 0) {
        true -> "even"
        false -> "odd"
    }
}