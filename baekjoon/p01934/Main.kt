package baekjoon.p01934

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val (a, b) = readLine()!!.split(" ").map { it2 -> it2.toInt() }
        println(solve(a, b))
    }
}

private fun solve(a: Int, b: Int): Int {
    return (a * b / gcd(a, b))
}

private fun gcd(a: Int, b: Int): Int {
    if (a % b == 0) {
        return b
    }

    return gcd(b, a % b)
}