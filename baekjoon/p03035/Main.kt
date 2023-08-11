package baekjoon.p03035

fun main(args: Array<String>) {
    val (r, c, zr, zc) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = List(r) { readLine()!! }
    println(solve(inputs, zr, zc))
}

private fun solve(inputs: List<String>, zr: Int, zc: Int): String {
    return buildString {
        for (str in inputs) {
            val zcStr = str.map { it.toString().repeat(zc) }.joinToString("")
            repeat(zr) {
                appendln(zcStr)
            }
        }
    }
}