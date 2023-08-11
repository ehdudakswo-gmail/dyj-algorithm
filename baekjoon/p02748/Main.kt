package baekjoon.p02748

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

//    println(P02748Kt().solve(n))
    println(P02748Kt().solve2(n))
}

private class P02748Kt {

    val cache = LongArray(91)

    init {
        cache.fill(-1)
    }

    fun solve(n: Int): Long {
        if (n == 0 || n == 1) {
            return n.toLong()
        }

        if (cache[n] != -1L) {
            return cache[n]
        }

        val ret = solve(n - 2) + solve(n - 1)
        cache[n] = ret
        return ret
    }

    fun solve2(n: Int): Long {
        val ret = LongArray(91)
        ret[0] = 0
        ret[1] = 1

        for (i in 2..n) {
            ret[i] = ret[i - 2] + ret[i - 1]
        }

        return ret[n]
    }

}