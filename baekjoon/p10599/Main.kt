package baekjoon.p10599

fun main(args: Array<String>) {
    while (true) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        if (inputs.all { it == 0 }) {
            break
        }

        println(solve(inputs).joinToString(" "))
    }
}

private fun solve(inputs: List<Int>): Array<Int> {
    return arrayOf(
            inputs[2] - inputs[1],
            inputs[3] - inputs[0]
    )
}