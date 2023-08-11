package baekjoon.p03049

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(n: Int): Int {
    return mul(n downTo n - 3) / fac(4)
}

private fun mul(range: IntProgression): Int {
    var ret = 1

    for (n in range) {
        ret *= n
    }

    return ret
}

private fun fac(n: Int): Int {
    return when (n <= 1) {
        true -> 1
        false -> n * fac(n - 1)
    }
}