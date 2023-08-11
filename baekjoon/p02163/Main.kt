package baekjoon.p02163

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()

    print(solve(n, m))
}

private fun solve(n: Int, m: Int): Int {
    return n - 1 + n * (m - 1)
}