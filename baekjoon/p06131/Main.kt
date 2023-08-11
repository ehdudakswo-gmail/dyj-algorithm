package baekjoon.p06131

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(n: Int): Int {
    return (1..500).sumBy { a ->
        (1..a).count { b -> (a * a == b * b + n) }
    }
}