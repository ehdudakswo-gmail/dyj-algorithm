package baekjoon.p11008

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val inputs = readLine()!!.split(" ")
        println(solve(inputs[0], inputs[1]))
    }
}

private fun solve(s: String, p: String): Int {
    return s.replace(p, " ").length
}