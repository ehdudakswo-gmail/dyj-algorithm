package baekjoon.p03076

fun main() {
    val (r, c) = readLine()!!.split(" ").map { it.toInt() }
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println(solve(r, c, a, b).joinToString("\n"))
}

private fun solve(r: Int, c: Int, a: Int, b: Int): List<String> {
    val x = "X".repeat(b)
    val dot = ".".repeat(b)
    val ret = ArrayList<String>()

    for (i in 0 until r) {
        val sb = StringBuilder()
        for (j in 0 until c) {
            when (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) {
                true -> sb.append(x)
                false -> sb.append(dot)
            }
        }

        val line = sb.toString()
        repeat(a) {
            ret.add(line)
        }
    }

    return ret
}