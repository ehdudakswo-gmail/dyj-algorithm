package baekjoon.p05522

fun main(args: Array<String>) {
    val inputs = IntArray(5)

    for (i in 0 until inputs.size) {
        inputs[i] = readLine()!!.toInt()
    }

    val ret = inputs.sum()
    println(ret)
}