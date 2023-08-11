package baekjoon.p04597

fun main(args: Array<String>) {
    while (true) {
        val input = readLine()!!
        if (input == "#") {
            break
        }

        println(solve(input))
    }
}

private fun solve(input: String): String {
    return buildString {
        append(input.dropLast(1))
        append(bit(input.last(), count { it == '1' }))
    }
}

private fun bit(last: Char, cnt: Int): Char {
    return when (last) {
        'e' -> ('0' + cnt % 2)
        'o' -> ('1' - cnt % 2)
        else -> '?'
    }
}