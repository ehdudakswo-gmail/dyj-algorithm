package baekjoon.p09584

fun main(args: Array<String>) {
    val str = readLine()!!
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!! }
    val solve = solve(str, inputs)
    println(solve.size)
    println(solve.joinToString("\n"))
}

private fun solve(str: String, inputs: List<String>): List<String> {
    return inputs.filter { check(str, it) }
}

private fun check(a: String, b: String): Boolean {
    return when (a.length == b.length) {
        true -> (0 until a.length).all { a[it] == '*' || a[it] == b[it] }
        false -> false
    }
}