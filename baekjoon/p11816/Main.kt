package baekjoon.p11816

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): Int {
    return when (input[0]) {
        '0' -> return when (input[1]) {
            'x' -> input.substring(2).toInt(16)
            else -> input.substring(1).toInt(8)
        }
        else -> input.toInt()
    }
}