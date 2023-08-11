package baekjoon.p05363

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!))
    }
}

private fun solve(input: String): String {
    val inputs = input.split(" ")
    return buildString {
        for (i in 2 until inputs.size) {
            append(inputs[i])
            append(" ")
        }

        for (i in 0 until 2) {
            append(inputs[i])
            append(" ")
        }
    }
}