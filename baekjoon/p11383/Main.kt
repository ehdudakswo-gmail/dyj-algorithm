package baekjoon.p11383

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val a = List(n) { readLine()!! }
    val b = List(n) { readLine()!! }
    println(solve(a, b))
}

private fun solve(a: List<String>, b: List<String>): String {
    for (i in 0 until a.size) {
        if (a[i].map { "$it$it" }.joinToString("") != b[i]) {
            return "Not Eyfa"
        }
    }

    return "Eyfa"
}