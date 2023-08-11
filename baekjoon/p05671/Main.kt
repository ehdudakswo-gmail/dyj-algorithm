package baekjoon.p05671

fun main(args: Array<String>) {
    while (true) {
        val input = readLine() ?: break
        val inputs = input.split(" ").map { it.toInt() }
        println(solve(inputs[0], inputs[1]))
    }
}

private fun solve(n: Int, m: Int): Int {
    return (n..m).count { check(it) }
}

private fun check(n: Int): Boolean {
    var nn = n
    val cnt = IntArray(10)

    while (nn != 0) {
        cnt[nn % 10]++
        nn /= 10
    }

    return cnt.all { it <= 1 }
}