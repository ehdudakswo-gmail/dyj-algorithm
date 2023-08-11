package baekjoon.p10569

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val inputs = readLine()!!.split(" ").map { it2 -> it2.toInt() }
        val ret = 2 - inputs[0] + inputs[1]
        println(ret)
    }
}