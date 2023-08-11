package baekjoon.p09498

fun main(args: Array<String>) {
    val input = readLine()!!.toInt()
    println(solve(input))
}

private fun solve(input: Int): String {
    when (input) {
        in 90..100 -> return "A"
        in 80..89 -> return "B"
        in 70..79 -> return "C"
        in 60..69 -> return "D"
    }

    return "F"
}