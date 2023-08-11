package baekjoon.p07567

fun main(args: Array<String>) {
    val input = readLine().toString()
    println(solve(input))
}

private fun solve(input: String): Int {
    var ret = 10

    for (i in 1 until input.length) {
        if (input[i - 1] == input[i]) {
            ret += 5
        } else {
            ret += 10
        }
    }

    return ret
}