package baekjoon.p02745

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ")
    println(solve(inputs[0], inputs[1].toInt()))
}

private fun solve(n: String, b: Int) = n.toInt(b)