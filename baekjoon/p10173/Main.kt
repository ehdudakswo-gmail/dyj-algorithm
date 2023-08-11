package baekjoon.p10173

fun main(args: Array<String>) {
    while (true) {
        val input = readLine()!!
        if (input == "EOI") {
            break
        }

        println(solve(input))
    }
}

private fun solve(input: String): String {
    return when (input.toUpperCase().contains("NEMO")) {
        true -> "Found"
        false -> "Missing"
    }
}