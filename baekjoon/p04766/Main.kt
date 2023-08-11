package baekjoon.p04766

fun main(args: Array<String>) {
    val inputs = ArrayList<Double>()
    while (true) {
        val input = readLine()!!.toDouble()
        if (input == 999.0) {
            break
        }

        inputs.add(input)
    }

    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: ArrayList<Double>): Array<String> {
    val ret = Array(inputs.size - 1) { "" }
    for (i in 0 until ret.size) {
        ret[i] = "%.2f".format(inputs[i + 1] - inputs[i])
    }

    return ret
}