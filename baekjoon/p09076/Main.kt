package baekjoon.p09076

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        println(solve(inputs))
    }
}

private fun solve(inputs: IntArray): String {
    val list = inputs.sorted().filterIndexed { index, value -> (index in 1..3) }
    val diff = list.last() - list.first()

    return when {
        diff >= 4 -> "KIN"
        else -> list.sum().toString()
    }
}