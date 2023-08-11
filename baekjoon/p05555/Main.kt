package baekjoon.p05555

fun main(args: Array<String>) {
    val str = readLine()!!
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!! }
    println(solve(str, inputs))
}

private fun solve(str: String, inputs: List<String>): Int {
    return inputs.count { str in it.repeat(2) }
}