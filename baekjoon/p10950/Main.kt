package baekjoon.p10950

fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    val inputs = Array(t) { IntArray(2) }

    for (input in inputs) {
        val arr = readLine()!!.split(" ")
        input[0] = arr[0].toInt()
        input[1] = arr[1].toInt()
    }

    for (ret in solve(inputs)) {
        println(ret)
    }
}

private fun solve(inputs: Array<IntArray>): IntArray {
    val ret = IntArray(inputs.size)

    for (i in 0 until inputs.size) {
        ret[i] = inputs[i][0] + inputs[i][1]
    }

    return ret
}