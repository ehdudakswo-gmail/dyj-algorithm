package baekjoon.p02475

fun main(args: Array<String>) {
    val inputs = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val ret = inputs.map { it.times(it) }.sum().rem(10)
    println(ret)
}