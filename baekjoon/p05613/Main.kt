package baekjoon.p05613

fun main(args: Array<String>) {
    val inputs = ArrayList<String>(3)
    while (true) {
        val input = readLine()!!
        if (input == "=") break
        inputs.add(input)
    }
    println(solve(inputs))
}

private fun solve(inputs: List<String>): Int {
    var ret = inputs.first().toInt()

    for (i in 1 until inputs.size step 2) {
        val op = inputs[i]
        val n = inputs[i + 1].toInt()
        when (op) {
            "+" -> ret += n
            "-" -> ret -= n
            "*" -> ret *= n
            "/" -> ret /= n
        }
    }

    return ret
}