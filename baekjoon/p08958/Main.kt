package baekjoon.p08958

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine().toString()))
    }
}

private fun solve(input: String): Int {
    var ret = 0
    var score = 0

    for (ch in input) {
        if (ch == 'O') {
            score++
            ret += score
        } else {
            score = 0
        }
    }

    return ret
}