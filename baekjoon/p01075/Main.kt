package baekjoon.p01075

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt(), readLine()!!.toInt()))
}

private fun solve(n: Int, f: Int): String {
    var nn = (n / 100) * 100
    while (nn % f != 0) {
        nn++
    }

    return "%02d".format(nn % 100)
}