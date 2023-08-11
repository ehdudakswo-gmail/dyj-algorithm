package baekjoon.p01927

import java.util.*

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!!.toInt() }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: List<Int>): List<Int> {
    val ret = ArrayList<Int>()
    val heap = MinHeap()

    for (input in inputs) {
        when (input) {
            0 -> {
                when (heap.isEmpty()) {
                    true -> ret.add(0)
                    false -> ret.add(heap.remove())
                }
            }
            else -> {
                heap.add(input)
            }
        }
    }

    return ret
}

private class MinHeap {

    private val pq = PriorityQueue<Int>()

    fun isEmpty(): Boolean {
        return pq.isEmpty()
    }

    fun add(n: Int) {
        pq.add(n)
    }

    fun remove(): Int {
        return pq.remove()
    }

}