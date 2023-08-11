package baekjoon.p02702

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        println(solve(inputs[0], inputs[1]).joinToString(" "))
    }
}

private fun solve(a: Int, b: Int): Array<Int> {
    val gcd = gcd(a, b)
    return arrayOf(
            (a * b) / gcd,
            gcd
    )
}

private fun gcd(a: Int, b: Int): Int {
    if (a % b == 0) {
        return b
    }

    return gcd(b, a % b)
}