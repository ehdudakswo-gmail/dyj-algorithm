package baekjoon.p02010

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = IntArray(n)

    for (i in 0 until inputs.size) {
        inputs[i] = readLine()!!.toInt()
    }

    val ret = inputs.map { it.dec() }.sum().inc()
    println(ret)
}