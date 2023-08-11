package baekjoon.p09243

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt(), readLine()!!, readLine()!!))
}

private fun solve(n: Int, a: String, b: String): String {
    return when (revBit(a, n) == (b)) {
        true -> "Deletion succeeded"
        false -> "Deletion failed"
    }
}

private fun revBit(str: String, n: Int): String {
    if (n % 2 == 0) {
        return str
    }

    return str.replace('1', '2')
            .replace('0', '1')
            .replace('2', '0')
}