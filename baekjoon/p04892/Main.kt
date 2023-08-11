package baekjoon.p04892

fun main(args: Array<String>) {
    var t = 1
    while (true) {
        val input = readLine()!!.toInt()
        if (input == 0) break
        val solves = solve(input)
        println("$t. ${solves[0]} ${solves[1]}")
        t++
    }
}

private fun solve(n: Int): Array<String> {
    val n1 = 3 * n
    var n2 = 0
    var ret = ""

    when (n1 % 2 == 0) {
        true -> {
            n2 = n1 / 2
            ret = "even"
        }
        false -> {
            n2 = (n1 + 1) / 2
            ret = "odd"
        }
    }

    val n3 = 3 * n2
    val n4 = n3 / 9

    return arrayOf(ret, n4.toString())
}