package baekjoon.p10101

fun main(args: Array<String>) {
    val inputs = List(3) { readLine()!!.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: List<Int>): String {
    return when (inputs.sum()) {
        180 -> {
            return when (inputs.toSet().size) {
                1 -> "Equilateral"
                2 -> "Isosceles"
                else -> "Scalene"
            }
        }
        else -> "Error"
    }
}