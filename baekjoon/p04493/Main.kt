package baekjoon.p04493

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        val inputs = Array(n) { readLine()!!.split(" ") }
        println(solve(inputs))
    }
}

private fun solve(inputs: Array<List<String>>): String {
    val win = IntArray(2)

    for (input in inputs) {
        if (input[0] == input[1]) {
            continue
        }

        when (win(input[0], input[1])) {
            true -> win[0]++
            false -> win[1]++
        }
    }

    return when {
        win[0] > win[1] -> "Player 1"
        win[0] < win[1] -> "Player 2"
        else -> "TIE"
    }
}

private fun win(a: String, b: String): Boolean {
    return when (a) {
        "R" -> (b == "S")
        "P" -> (b == "R")
        "S" -> (b == "P")
        else -> false
    }
}