package baekjoon.p10474

fun main(args: Array<String>) {
    while (true) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        if (a == 0 && b == 0) {
            break
        }

        println(solve(a, b).joinToString(" "))
    }
}

private fun solve(a: Int, b: Int): Array<String> {
    return arrayOf(
            (a / b).toString(),
            (a % b).toString(),
            "/",
            b.toString()
    )
}