package baekjoon.p10871

fun main(args: Array<String>) {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }
    val inputs = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    for (ret in inputs.filter { it < x }) {
        print(ret)
        print(" ")
    }
}