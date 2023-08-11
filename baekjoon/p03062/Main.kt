package baekjoon.p03062

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!.toInt()))
    }
}

private fun solve(input: Int): String {
    val sum = input + input.toString().reversed().toInt()
    val str = sum.toString()

    return when (str == str.reversed()) {
        true -> "YES"
        false -> "NO"
    }
}