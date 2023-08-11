package baekjoon.p10819

import kotlin.math.abs

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map { it.toInt() }
    println(solve(inputs))
}

private fun solve(inputs: List<Int>): Int {
    val arr = inputs.sorted().toIntArray()
    return list(arr).map { sum(it) }.max()!!
}

private fun list(arr: IntArray): List<IntArray> {
    val ret = ArrayList<IntArray>()
    var next = arr

    while (next.isNotEmpty()) {
        ret.add(next)
        next = next(next)
    }

    return ret
}

private fun next(input: IntArray): IntArray {
    val arr = input.clone()
    val cut = (input.lastIndex - 1 downTo 0).find { arr[it] < arr[it + 1] } ?: return intArrayOf()
    val min = (input.lastIndex downTo cut + 1).find { arr[it] > arr[cut] }!!

    swap(arr, cut, min)
    arr.sort(cut + 1)

    return arr
}

private fun swap(arr: IntArray, a: Int, b: Int) {
    val temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp
}

private fun sum(arr: IntArray): Int {
    return (0 until arr.lastIndex).sumBy { abs((arr[it] - arr[it + 1])) }
}