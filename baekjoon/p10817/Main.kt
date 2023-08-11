package baekjoon.p10817

fun main(args: Array<String>) {
    val input = readLine().toString()
    val inputs = input.split(" ")

    val a = inputs[0].toInt()
    val b = inputs[1].toInt()
    val c = inputs[2].toInt()

    val arr = arrayOf(a, b, c)
    arr.sort()
    println(arr[1])
}