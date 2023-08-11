package baekjoon.p04880

fun main(args: Array<String>) {
    while (true) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        if (inputs.all { it == 0 }) break
        println(solve(inputs[0], inputs[1], inputs[2]).joinToString(" "))
    }
}

private fun solve(a: Int, b: Int, c: Int): Array<String> {
    return when (b - a == c - b) {
        true -> arrayOf("AP", (c + (b - a)).toString())
        false -> arrayOf("GP", (c * (b / a)).toString())
    }
}