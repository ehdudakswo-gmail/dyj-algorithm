package baekjoon.p04613

fun main(args: Array<String>) {
    while (true) {
        val input = readLine()!!
        if (input == "#") {
            break
        }

        println(solve(input))
    }
}

private fun solve(input: String): Int {
    return input.mapIndexed { index, c ->
        when (c.isUpperCase()) {
            true -> (index + 1) * (c - 'A' + 1)
            false -> 0
        }
    }.sum()
}