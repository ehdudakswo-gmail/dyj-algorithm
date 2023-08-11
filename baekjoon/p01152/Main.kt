package baekjoon.p01152

fun main(args: Array<String>) {
    println(solve(readLine()!!.trim()))
}

private fun solve(input: String): Int {
    return when (input.isEmpty()) {
        true -> 0
        false -> input.split(" ").size
    }
}