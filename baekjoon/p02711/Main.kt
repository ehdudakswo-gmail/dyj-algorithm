package baekjoon.p02711

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.trim().split(" ")
        println(solve(inputs[0].toInt(), inputs[1]))
    }
}

private fun solve(input: Int, input2: String): String {
    return buildString {
        append(input2)
        deleteCharAt(input - 1)
    }
}