package baekjoon.p10988

fun main(args: Array<String>) {
    val input = readLine().toString()
    println(solve(input))
}

private fun solve(input: String): Int {
    val len = input.length

    for (i in 0 until len / 2) {
        if (input[i] != input[len - 1 - i]) {
            return 0
        }
    }

    return 1
}