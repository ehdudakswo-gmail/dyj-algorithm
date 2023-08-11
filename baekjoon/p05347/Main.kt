package baekjoon.p05347

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toLong() }
        println(solve(inputs[0], inputs[1]))
    }
}

private fun solve(a: Long, b: Long): Long {
    return (a * b) / gcd(a, b)
}

private fun gcd(a: Long, b: Long): Long {
    return when (b == 0L) {
        true -> a
        false -> gcd(b, a % b)
    }
}