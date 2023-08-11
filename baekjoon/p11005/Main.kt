package baekjoon.p11005

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs[0], inputs[1]))
}

private fun solve(n: Int, d: Int): String {
    return n.toString(d).toUpperCase()
}