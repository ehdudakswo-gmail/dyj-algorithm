package baekjoon.p01526

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()))
}

private fun solve(n: Int): Int {
    for (i in n downTo 4) {
        if (i.toString().all { it == '4' || it == '7' }) {
            return i
        }
    }

    return -1
}