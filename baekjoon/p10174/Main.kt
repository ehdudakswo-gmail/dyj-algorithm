package baekjoon.p10174

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!))
    }
}

private fun solve(input: String): String {
    val lower = input.toLowerCase()
    val rev = lower.reversed()

    return when (lower == rev) {
        true -> "Yes"
        false -> "No"
    }
}