package baekjoon.p01546

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.trim().split(" ").map { it.toInt() }.toIntArray()
    println(solve(inputs))
}

private fun solve(inputs: IntArray): String {
    val list = DoubleArray(inputs.size)
    val max = inputs.max()!!.toDouble()

    for (i in 0 until list.size) {
        list[i] = (inputs[i] / max) * 100
    }

//    return "%.2f".format(list.average())
    return list.average().toString()
}