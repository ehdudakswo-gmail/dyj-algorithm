package baekjoon.p05691

fun main(args: Array<String>) {
    while (true) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        if (inputs.all { it == 0 }) break
        println(solve(inputs[0], inputs[1]))
    }
}

private fun solve(a: Int, b: Int): Int {
    return a * 3 - (a + b)
}