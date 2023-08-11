package baekjoon.p10769

fun main(args: Array<String>) {
    println(solve(readLine()!!))
}

private fun solve(input: String): String {
    val a = input.split(":-)").size - 1
    val b = input.split(":-(").size - 1

    return when {
        a == 0 && b == 0 -> "none"
        a > b -> "happy"
        a < b -> "sad"
        else -> "unsure"
    }
}