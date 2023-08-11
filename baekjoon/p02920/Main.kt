package baekjoon.p02920

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: List<Int>): String {
    return when (inputs) {
        inputs.sorted() -> "ascending"
        inputs.sortedDescending() -> "descending"
        else -> "mixed"
    }
}