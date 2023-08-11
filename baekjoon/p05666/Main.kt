package baekjoon.p05666

fun main(args: Array<String>) {
    while (true) {
        val input = readLine() ?: break
        val inputs = input.split(" ").map { it.toInt() }
        println(solve(inputs[0], inputs[1]))
    }
}

private fun solve(h: Int, p: Int): String {
    return "%.2f".format(h.toDouble() / p)
}