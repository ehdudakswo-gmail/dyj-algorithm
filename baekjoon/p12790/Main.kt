package baekjoon.p12790

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        println(solve(inputs))
    }
}

private fun solve(inputs: List<Int>): Int {
    val list = (0 until inputs.size / 2).map {
        val sum = inputs[it] + inputs[it + 4]
        when (it) {
            0, 1 -> if (sum < 1) 1 else sum
            2 -> if (sum < 0) 0 else sum
            else -> sum
        }
    }

    return (0 until list.size).sumBy {
        when (it) {
            0 -> list[it]
            1 -> 5 * list[it]
            else -> 2 * list[it]
        }
    }
}