package baekjoon.p11320

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        println(solve(inputs[0], inputs[1]))
    }
}

private fun solve(a: Int, b: Int): Int {
    return (a.times(a) / b.times(b))
}