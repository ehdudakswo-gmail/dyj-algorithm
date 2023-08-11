package baekjoon.p08949

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs[0], inputs[1]))
}

private fun solve(a: Int, b: Int): String {
    return buildString {
        val maxLen = maxOf(a.toString().length, b.toString().length)
        var aa = a
        var bb = b

        for (i in 0 until maxLen) {
            insert(0, (aa % 10) + (bb % 10))
            aa /= 10
            bb /= 10
        }
    }
}