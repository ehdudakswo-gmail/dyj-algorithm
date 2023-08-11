package baekjoon.p09366

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        println("Case #${it + 1}: ${solve(inputs)}")
    }
}

private fun solve(inputs: List<Int>): String {
    val sorted = inputs.sorted()
    return when {
        (sorted[0] + sorted[1] <= sorted[2]) -> "invalid!"
        (sorted[0] == sorted[2]) -> "equilateral"
        (sorted[0] == sorted[1] || sorted[1] == sorted[2]) -> "isosceles"
        else -> "scalene"
    }
}