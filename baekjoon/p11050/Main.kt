package baekjoon.p11050

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs[0], inputs[1]))
}

private fun solve(n: Int, k: Int): Int {
    return fac(n) / (fac(n - k) * fac(k))
}

private fun fac(n: Int): Int {
    return when (n <= 1) {
        true -> 1
        false -> n * fac(n - 1)
    }
}