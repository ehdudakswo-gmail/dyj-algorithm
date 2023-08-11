package baekjoon.p05724

fun main(args: Array<String>) {
    while (true) {
        val input = readLine()!!.toInt()
        if (input == 0) break
        println(solve(input))
    }
}

private fun solve(n: Int): Int {
    return (1..n).sumBy { val i = (n - it + 1);i * i }
}