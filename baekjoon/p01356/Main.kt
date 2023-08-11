package baekjoon.p01356

fun main() {
    println(solve(readLine()!!.toInt()))
}

private fun solve(input: Int): String {
    val str = input.toString()
    val len = str.length

    for (i in 1 until len) {
        val a = str.substring(0, i)
        val b = str.substring(i, len)
        if (mul(a) == mul(b)) {
            return "YES"
        }
    }

    return "NO"
}

private fun mul(str: String): Int {
    var ret = 1
    for (i in 0 until str.length) {
        ret *= (str[i] - '0')
    }

    return ret
}