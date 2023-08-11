package baekjoon.p01755

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    val solve = solve(inputs[0], inputs[1])
    for (i in 0 until solve.size) {
        print("${solve[i]} ")
        if (i % 10 == 9) {
            println()
        }
    }
}

private fun solve(m: Int, n: Int): List<Int> {
    return (m..n).sortedBy { string(it) }
}

private fun string(n: Int): String {
    val set = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    var ret = ""

    for (ch in n.toString()) {
        ret += set[ch - '0']
    }

    return ret
}