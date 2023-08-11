package baekjoon.p10205

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = List(2) { readLine()!! }
        val solve = solve(inputs[0].toInt(), inputs[1])
        println("Data Set ${it + 1}:\n$solve\n")
    }
}

private fun solve(h: Int, str: String): Int {
    return str.fold(h) { acc, c ->
        acc + when (c) {
            'b' -> -1
            'c' -> 1
            else -> 0
        }
    }
}