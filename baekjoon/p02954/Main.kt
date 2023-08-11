package baekjoon.p02954

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): String {
    return buildString {
        var i = 0
        while (i < input.length) {
            val ch = input[i]
            append(ch)

            when (ch in "aeiou") {
                true -> i += 3
                false -> i++
            }
        }
    }
}