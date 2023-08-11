package baekjoon.p11170

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        println(solve(inputs[0], inputs[1]))
    }
}

private fun solve(n: Int, m: Int): Int {
    var ret = 0

    for (i in n..m) {
        ret += cnt(i, 0)
    }

    return ret
}

private fun cnt(n: Int, target: Int): Int {
    var ret = 0
    var num = n

    while (true) {
        if (num % 10 == target) {
            ret++
        }

        num /= 10
        if (num == 0) {
            break
        }
    }

    return ret
}