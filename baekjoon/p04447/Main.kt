package baekjoon.p04447

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!))
    }
}

private fun solve(input: String): String {
    val lower = input.toLowerCase()
    val g = lower.count { it == 'g' }
    val b = lower.count { it == 'b' }

    return when {
        g > b -> input.plus(" is GOOD")
        g < b -> input.plus(" is A BADDY")
        else -> input.plus(" is NEUTRAL")
    }
}