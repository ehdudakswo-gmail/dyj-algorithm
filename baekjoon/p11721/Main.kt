package baekjoon.p11721

fun main(args: Array<String>) {
    println(solve(readLine()!!).joinToString("\n"))
}

private fun solve(input: String): ArrayList<String> {
    val ret = ArrayList<String>()
    val step = 10

    for (start in 0 until input.length step step) {
        val end = minOf(start + step, input.length)
        ret.add(input.substring(start until end))
    }

    return ret
}