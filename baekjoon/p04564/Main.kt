package baekjoon.p04564

fun main(args: Array<String>) {
    while (true) {
        val input = readLine()!!.toInt()
        if (input == 0) break
        println(solve(input).joinToString(" "))
    }
}

private fun solve(input: Int): List<Int> {
    val ret = ArrayList<Int>()
    var n = input

    while (n >= 10) {
        ret.add(n)
        n = mul(n)
    }
    ret.add(n)

    return ret
}

private fun mul(n: Int): Int {
    var ret = 1
    var nn = n

    while (nn != 0) {
        ret *= (nn % 10)
        nn /= 10
    }

    return ret
}