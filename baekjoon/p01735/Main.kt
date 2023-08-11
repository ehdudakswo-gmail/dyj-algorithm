package baekjoon.p01735

fun main(args: Array<String>) {
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    println(solve(a, b).joinToString(" "))
}

private fun solve(a: List<Int>, b: List<Int>): IntArray {
    val aa = a[0] * b[1] + a[1] * b[0]
    val bb = a[1] * b[1]
    val gcd = gcd(aa, bb)

    return intArrayOf(aa / gcd, bb / gcd)
}

private fun gcd(a: Int, b: Int): Int {
    return when (b == 0) {
        true -> a
        false -> gcd(b, a % b)
    }
}