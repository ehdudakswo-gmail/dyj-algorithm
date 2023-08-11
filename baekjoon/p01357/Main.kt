package baekjoon.p01357

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs[0], inputs[1]))
}

private fun solve(x: Int, y: Int): Int {
    return rev(rev(x) + rev(y))
}

private fun rev(n: Int): Int {
    return n.toString().reversed().toInt()
}