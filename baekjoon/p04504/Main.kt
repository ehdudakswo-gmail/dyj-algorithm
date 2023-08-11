package baekjoon.p04504

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    while (true) {
        val input = readLine()!!.toInt()
        if (input == 0) {
            break
        }

        println(solve(n, input))
    }
}

private fun solve(n: Int, input: Int): String {
    return when (input % n == 0) {
        true -> "$input is a multiple of $n."
        false -> "$input is NOT a multiple of $n."
    }
}