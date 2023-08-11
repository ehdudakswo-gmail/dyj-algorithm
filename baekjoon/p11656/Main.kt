package baekjoon.p11656

fun main(args: Array<String>) {
    for (solve in solve(readLine()!!.trim())) {
        println(solve)
    }
}

private fun solve(input: String): List<String> {
    return Array(input.length) { input.substring(it) }.sorted()
}