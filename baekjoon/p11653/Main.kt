package baekjoon.p11653

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val result = solve(n)

    for (ret in result) {
        println(ret)
    }
}

private fun solve(input: Int): ArrayList<Int> {
    val ret = ArrayList<Int>()
    var n = input
    var i = 2

    while (i * i <= n) {
        while (n % i == 0) {
            ret.add(i)
            n /= i
        }
        i++
    }

    if (n > 1) {
        ret.add(n)
    }

    return ret
}