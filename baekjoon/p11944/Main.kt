package baekjoon.p11944

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs[0], inputs[1]))
}

private fun solve(n: Int, m: Int): String {
    return n.toString().repeat(n).take(m)
}