package baekjoon.p05586

fun main(args: Array<String>) {
    println(solve(readLine()!!).joinToString("\n"))
}

private fun solve(input: String): Array<Int> {
    val list = (0..input.lastIndex - 2).map { input.substring(it, it + 3) }
    return arrayOf(
            list.count { it == "JOI" },
            list.count { it == "IOI" }
    )
}