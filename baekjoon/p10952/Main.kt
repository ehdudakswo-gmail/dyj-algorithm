package baekjoon.p10952

fun main(args: Array<String>) {
    val inputs = ArrayList<IntArray>()

    while (true) {
        val input = readLine()!!.split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()

        if (a == 0 && b == 0) {
            break
        }

        inputs.add(intArrayOf(a, b))
    }

    for (ret in solve(inputs)) {
        println(ret)
    }
}

private fun solve(inputs: ArrayList<IntArray>): IntArray {
    val ret = IntArray(inputs.size)

    for (i in 0 until inputs.size) {
        ret[i] = inputs[i][0] + inputs[i][1]
    }

    return ret
}