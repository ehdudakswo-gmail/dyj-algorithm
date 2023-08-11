package baekjoon.p05218

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ")
        val solve = solve(inputs[0], inputs[1]).joinToString(" ")
        println("Distances: $solve")
    }
}

private fun solve(input: String, input2: String): IntArray {
    return IntArray(input.length) { (input2[it] - input[it] + 26) % 26 }
}