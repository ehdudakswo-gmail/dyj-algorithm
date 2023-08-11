package baekjoon.p02484

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = Array(n) { readLine()!!.split(" ").map { it.toInt() } }
    println(solve(inputs))
}

private fun solve(inputs: Array<List<Int>>): Int {
    return (0..inputs.lastIndex).map { score(inputs[it]) }.max()!!
}

private fun score(input: List<Int>): Int {
    val sorted = input.sorted()
    return when (sorted.distinct().size) {
        1 -> (50000 + input[0] * 5000)
        2 -> {
            when (sorted[0] == sorted[1] && sorted[2] == sorted[3]) {
                true -> (2000 + sorted[0] * 500 + sorted[2] * 500)
                false -> (10000 + sorted[1] * 1000)
            }
        }
        3 -> {
            (1000 + when (sorted[0] == sorted[1]) {
                true -> sorted[0]
                false -> sorted[2]
            } * 100)
        }
        else -> (input.max()!! * 100)
    }
}