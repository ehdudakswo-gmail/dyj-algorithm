package baekjoon.p03181

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): String {
    return buildString {
        val except = setOf("i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili")
        val inputs = input.split(" ")

        for (i in 0 until inputs.size) {
            if (i == 0 || !except.contains(inputs[i])) {
                append(inputs[i].first().toUpperCase())
            }
        }
    }
}