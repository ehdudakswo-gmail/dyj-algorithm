package baekjoon.p04101

fun main(args: Array<String>) {
    while (true) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }

        if (a == 0 && b == 0) {
            break
        }

        println(solve(a, b))
    }
}

private fun solve(a: Int, b: Int): String {
    return if (a > b) {
        "Yes"
    } else {
        "No"
    }
}