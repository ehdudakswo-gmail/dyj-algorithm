package baekjoon.p02712

fun main(args: Array<String>) {
    repeat(readLine()!!.trim().toInt()) {
        val inputs = readLine()!!.split(" ")
        println(solve(inputs[0].toDouble(), inputs[1]))
    }
}

private fun solve(a: Double, b: String): String {
    return when (b) {
        "kg" -> "%.4f %s".format(a * 2.2046, "lb")
        "lb" -> "%.4f %s".format(a * 0.4536, "kg")
        "l" -> "%.4f %s".format(a * 0.2642, "g")
        "g" -> "%.4f %s".format(a * 3.7854, "l")
        else -> ""
    }
}