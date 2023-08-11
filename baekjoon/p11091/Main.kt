package baekjoon.p11091

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        println(solve(readLine()!!.trim()))
    }
}

private fun solve(input: String): String {
    val except = ('a'..'z') - input.toLowerCase().filter { it.isLowerCase() }.toSet()
    return when (except.size) {
        0 -> "pangram"
        else -> "missing ${except.joinToString("")}"
    }
}