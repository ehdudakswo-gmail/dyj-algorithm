package baekjoon.p12778

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val (m, c) = readLine()!!.split(" ")
        val inputs = readLine()!!.split(" ")
        println(solve(c, inputs).joinToString(" "))
    }
}

private fun solve(c: String, inputs: List<String>): List<String> {
    return when (c == "C") {
        true -> inputs.map { (1 + it[0].toInt() - 'A'.toInt()).toString() }
        false -> inputs.map { ('A' + it.toInt() - 1).toString() }
    }
}