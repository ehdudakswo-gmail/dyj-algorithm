package baekjoon.p03029

fun main(args: Array<String>) {
    println(solve(readLine()!!, readLine()!!))
}

private fun solve(a: String, b: String): String {
    val aa = a.split(":").map { it.toInt() }
    val bb = b.split(":").map { it.toInt() }

    val aaa = aa[0] * 3600 + aa[1] * 60 + aa[2]
    val bbb = bb[0] * 3600 + bb[1] * 60 + bb[2]

    val mod = 3600 * 24
    val diff = (bbb - aaa + mod) % mod
    if (diff == 0) {
        return "24:00:00"
    }

    val h = diff / 3600
    val m = (diff % 3600) / 60
    val s = diff % 60

    return "%02d:%02d:%02d".format(h, m, s)
}