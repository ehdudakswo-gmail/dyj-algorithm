package baekjoon.p02754

fun main(args: Array<String>) {
    val input = readLine().toString()
    println(solve(input))
}

private fun solve(input: String): Double {
    if (input == "F") {
        return 0.0
    }

    var ret = 1.0
    ret += ('D' - input[0]).toDouble()
    ret += when (input[1]) {
        '+' -> 0.3
        '-' -> -0.3
        else -> 0.0
    }

    return ret
}