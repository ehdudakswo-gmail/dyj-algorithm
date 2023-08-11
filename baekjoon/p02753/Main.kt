package baekjoon.p02753

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println(solve(n))
}

private fun solve(n: Int): Int {
    if (n % 400 == 0) {
        return 1
    }

    if (n % 4 == 0 && n % 100 != 0) {
        return 1
    }

    return 0
}