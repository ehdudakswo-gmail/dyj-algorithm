package baekjoon.p05717

fun main(args: Array<String>) {
    while (true) {
        val (m, f) = readLine()!!.split(" ").map { it.toInt() }

        if (m == 0 && f == 0) {
            break
        }

        println(m + f)
    }
}