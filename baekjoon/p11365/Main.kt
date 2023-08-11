package baekjoon.p11365

fun main(args: Array<String>) {
    while (true) {
        val input = readLine()!!
        if (input == ("END")) {
            break
        }

        println(solve(input))
    }
}

private fun solve(input: String): String {
    return input.reversed()
}