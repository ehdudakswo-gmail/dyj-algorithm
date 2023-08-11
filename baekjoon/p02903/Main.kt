package baekjoon.p02903

fun main() {
    println(solve(readLine()!!.toInt()))
}

private fun solve(n: Int): Int {
    var x = 2
    repeat(n) {
        x = (x * 2 - 1)
    }

    return x * x
}