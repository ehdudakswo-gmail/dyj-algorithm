package baekjoon.p11652

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!!.toLong() }
    println(solve(inputs))
}

private fun solve(inputs: List<Long>): Long {
    val cnt = mutableMapOf<Long, Int>()
    inputs.forEach { cnt[it] = cnt.getOrDefault(it, 0).inc() }

    return cnt.maxWith(compareBy({ it.value }, { -it.key }))!!.key
}