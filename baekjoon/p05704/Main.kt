package baekjoon.p05704

fun main(args: Array<String>) {
    while (true) {
        val input = readLine()!!
        if (input == "*") {
            break
        }

        println(solve(input))
    }
}

private fun solve(input: String): String {
    return when (('a'..'z').all { input.contains(it) }) {
        true -> "Y"
        false -> "N"
    }
}