package baekjoon.p07523

fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    for (i in 1..t) {
        val inputs = readLine()!!.split(" ").map { it.toLong() }
        val solve = solve(inputs[0], inputs[1])
        println("Scenario #$i:\n$solve\n")
    }
}

private fun solve(n: Long, m: Long): Long {
    return (n + m) * (m - n + 1) / 2
}