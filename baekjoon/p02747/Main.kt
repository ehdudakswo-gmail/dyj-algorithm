package baekjoon.p02747

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
//    println(solve(n))
    println(solve2(n))
}

private val cache = IntArray(46) { -1 }

private fun solve(n: Int): Int {
    if (n <= 1) {
        return n
    }

    if (cache[n] != -1) {
        return cache[n]
    }

    val ret = solve(n - 2) + solve(n - 1)
    cache[n] = ret

    return ret
}

private fun solve2(n: Int): Int {
    val ret = IntArray(46)
    ret[0] = 0
    ret[1] = 1

    for (i in 2..n) {
        ret[i] = ret[i - 2] + ret[i - 1]
    }

    return ret[n]
}