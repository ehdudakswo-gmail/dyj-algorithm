package baekjoon.p02839

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(input: Int): Int {
    for (i in input / 5 downTo 0) {
        val r = input - (i * 5)
        if (r % 3 == 0) {
            return (i + r / 3)
        }
    }

    return -1
}