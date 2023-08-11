package baekjoon.p02693

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        println(solve(inputs))
    }
}

private fun solve(inputs: IntArray): Int {
    return inputs.sorted()[inputs.size - 3]
}