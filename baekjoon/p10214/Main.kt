package baekjoon.p10214

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = Array(9) { IntArray(2) }
        for (input in inputs) {
            val (a, b) = readLine()!!.split(" ").map { score -> score.toInt() }
            input[0] = a
            input[1] = b
        }

        println(solve(inputs))
    }
}

private fun solve(inputs: Array<IntArray>): String {
    val score = IntArray(2)

    for (input in inputs) {
        score[0] += input[0]
        score[1] += input[1]
    }

    return when {
        (score[0] > score[1]) -> "Yonsei"
        (score[0] < score[1]) -> "Korea"
        else -> "Draw"
    }
}