package baekjoon.p12780

fun main() {
    println(solve(readLine()!!, readLine()!!))
}

fun solve(h: String, n: String): Int {
    var ret = 0
    var idx = -1

    while (true) {
        idx = h.indexOf(n, idx + 1)
        if (idx == -1) {
            break
        }

        ret++
    }

    return ret
}