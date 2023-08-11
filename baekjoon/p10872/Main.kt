package baekjoon.p10872

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println(solve(n))
}

private fun solve(n: Int): Int {
    if (n <= 0) {
        return 1
    }

    return n * solve(n - 1)
}