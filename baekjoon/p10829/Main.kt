package baekjoon.p10829

fun main(args: Array<String>) {
    println(solve(readLine()!!.toLong()))
}

private fun solve(input: Long): String {
    return buildString {
        var n = input
        while (n != 0L) {
            insert(0, n % 2)
            n /= 2
        }
    }
}