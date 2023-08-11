package baekjoon.p01193

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(x: Int): String {
    var cnt = 0
    var i = 0

    while (i < x) {
        i += (++cnt)
    }

    val diff = (i - x)
    val a = diff + 1
    val b = cnt - diff

    return when (cnt % 2 == 1) {
        true -> "$a/$b"
        false -> "$b/$a"
    }
}