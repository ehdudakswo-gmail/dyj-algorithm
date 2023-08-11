package baekjoon.p02774

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!.toInt()))
    }
}

private fun solve(x: Int): Int {
    return x.toString().toSet().size
}