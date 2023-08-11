package baekjoon.p04999

fun main(args: Array<String>) {
    println(solve(readLine()!!, readLine()!!))
}

private fun solve(a: String, b: String): String {
    return when (a.length >= b.length) {
        true -> "go"
        false -> "no"
    }
}