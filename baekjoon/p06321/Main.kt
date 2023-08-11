package baekjoon.p06321

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        println("String #$i")
        println(solve(readLine()!!))
        println()
    }
}

private fun solve(input: String): String {
    return input.map {
        when (it) {
            'Z' -> 'A'
            else -> it + 1
        }
    }.joinToString("")
}