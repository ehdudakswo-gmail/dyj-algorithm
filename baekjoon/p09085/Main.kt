package baekjoon.p09085

fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        val inputs = readLine()!!.split(" ").map { input -> input.toInt() }
        println(inputs.sum())
    }
}