package baekjoon.p10698

fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    for (i in 1..t) {
        println("Case $i: ${solve(readLine()!!)}")
    }
}

private fun solve(input: String): String {
    val inputs = input.split(" ")
    val a = inputs[0].toInt()
    val op = inputs[1]
    val b = inputs[2].toInt()
    val c = inputs[4].toInt()

    var ret = 0
    when (op) {
        "+" -> ret = (a + b)
        "-" -> ret = (a - b)
    }

    return when (ret == c) {
        true -> "YES"
        false -> "NO"
    }
}