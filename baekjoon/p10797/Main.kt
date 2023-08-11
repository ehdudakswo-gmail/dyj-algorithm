package baekjoon.p10797

fun main(agrs: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    val ret = inputs.count { it == n }
    println(ret)
}