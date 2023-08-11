package baekjoon.p04153

fun main(args: Array<String>) {
    while (true) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        if (inputs.all { it == 0 }) break
        println(solve(inputs))
    }
}

private fun solve(inputs: List<Int>): String {
    val sorted = inputs.sorted()
    val mul = sorted.map { it * it }

    return when (mul[0] + mul[1] == mul[2]) {
        true -> "right"
        false -> "wrong"
    }
}