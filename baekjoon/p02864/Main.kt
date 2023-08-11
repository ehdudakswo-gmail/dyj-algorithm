package baekjoon.p02864

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs[0], inputs[1]).joinToString(" "))
}

private fun solve(a: Int, b: Int): Array<Int> {
    return arrayOf(
            replace(a, 6, 5) + replace(b, 6, 5),
            replace(a, 5, 6) + replace(b, 5, 6)
    )
}

private fun replace(n: Int, from: Int, to: Int): Int {
    return n.toString().replace('0' + from, '0' + to).toInt()
}