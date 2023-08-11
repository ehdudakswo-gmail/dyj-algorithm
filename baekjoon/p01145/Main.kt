package baekjoon.p01145

fun main() {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs))
}

fun solve(inputs: List<Int>): Int {
    var n = inputs.min()!!

    while (true) {
        val cnt = inputs.count { n % it == 0 }
        if (cnt >= 3) {
            break
        }

        n++
    }

    return n
}