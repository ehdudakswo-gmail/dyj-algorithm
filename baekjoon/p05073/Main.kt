package baekjoon.p05073

fun main(args: Array<String>) {
    while (true) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }
        if (inputs.all { it == 0 }) {
            break
        }
        println(solve(inputs))
    }
}

private fun solve(inputs: List<Int>): String {
    val sorted = inputs.sorted()

    return when {
        (sorted[0] + sorted[1] > sorted[2]) -> {
            when {
                (sorted[0] == sorted[2]) -> "Equilateral"
                (sorted[0] == sorted[1] || sorted[1] == sorted[2]) -> "Isosceles"
                else -> "Scalene"
            }
        }
        else -> "Invalid"
    }
}