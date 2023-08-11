package baekjoon.p09316

fun main(args: Array<String>) {
    println(solve(readLine()!!.toInt()).joinToString("\n"))
}

private fun solve(input: Int): Array<String> {
    return Array(input) { index ->
        "Hello World, Judge ${index + 1}!"
    }
}