package baekjoon.p10773

fun main(args: Array<String>) {
    val inputs = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: IntArray): Int {
    val list = ArrayList<Int>()

    for (input in inputs) {
        when (input) {
            0 -> list.removeAt(list.lastIndex)
            else -> list.add(input)
        }
    }

    return list.sum()
}