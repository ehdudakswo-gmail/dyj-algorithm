package baekjoon.p03036

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: List<Int>): List<String> {
    return (1 until inputs.size).map {
        val n = inputs[it]
        val gcd = gcd(inputs[0], n)
        "${inputs[0] / gcd}/${n / gcd}"
    }
}

private fun gcd(a: Int, b: Int): Int {
    return when (b == 0) {
        true -> a
        false -> gcd(b, a % b)
    }
}