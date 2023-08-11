package baekjoon.p11279

import java.util.*

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = List(n) { readLine()!!.toInt() }
    println(solve(inputs).joinToString("\n"))
}

private fun solve(inputs: List<Int>): List<Int> {
    val ret = ArrayList<Int>()
    val heap = MaxHeap()

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

private class MaxHeap {

    private val pq = PriorityQueue<Int>(Collections.reverseOrder())

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