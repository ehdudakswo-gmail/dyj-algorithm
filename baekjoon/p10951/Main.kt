package baekjoon.p10951

fun main(args: Array<String>) {
    while (true) {
        val input = readLine() ?: break
        val solve = input.split(" ").map { it.toInt() }.sum()
        println(solve)
    }
}